/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.datatype.Max52Text;
import com.tools20022.repository.entity.ExecutingTrader;
import com.tools20022.repository.entity.SecuritiesTransaction;
import com.tools20022.repository.entity.SubmittingPartyRole;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the securities transaction report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport2#mmTransactionIdentification
 * SecuritiesTransactionReport2.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport2#mmExecutingParty
 * SecuritiesTransactionReport2.mmExecutingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport2#mmSubmittingParty
 * SecuritiesTransactionReport2.mmSubmittingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport2#mmTechnicalAttributes
 * SecuritiesTransactionReport2.mmTechnicalAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport2#mmSupplementaryData
 * SecuritiesTransactionReport2.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTransaction
 * SecuritiesTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTransactionReport2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the securities transaction report."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesTransactionReport2", propOrder = {"transactionIdentification", "executingParty", "submittingParty", "technicalAttributes", "supplementaryData"})
public class SecuritiesTransactionReport2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max52Text transactionIdentification;
	/**
	 * Unique and unambiguous identification of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max52Text
	 * Max52Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmUniqueTradeIdentifier
	 * TradeIdentification.mmUniqueTradeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport2
	 * SecuritiesTransactionReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique and unambiguous identification of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmUniqueTradeIdentifier;
			componentContext_lazy = () -> SecuritiesTransactionReport2.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique and unambiguous identification of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max52Text.mmObject();
		}
	};
	protected LEIIdentifier executingParty;
	/**
	 * Identification of the entity executing the transaction. <br>
	 * <br>
	 * Usage:<br>
	 * For legal entities, use the legal entity identifier. For non-legal
	 * entities, this field shall be populated with an identifier as specified
	 * in the local regulation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExecutingTrader
	 * ExecutingTrader}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport2
	 * SecuritiesTransactionReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the entity executing the transaction. \r\n\r\nUsage:\r\nFor legal entities, use the legal entity identifier. For non-legal entities, this field shall be populated with an identifier as specified in the local regulation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExecutingParty = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> ExecutingTrader.mmObject();
			componentContext_lazy = () -> SecuritiesTransactionReport2.mmObject();
			isDerived = false;
			xmlTag = "ExctgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingParty";
			definition = "Identification of the entity executing the transaction. \r\n\r\nUsage:\r\nFor legal entities, use the legal entity identifier. For non-legal entities, this field shall be populated with an identifier as specified in the local regulation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};
	protected LEIIdentifier submittingParty;
	/**
	 * Entity submitting the transaction report to the competent authority.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SubmittingPartyRole
	 * SubmittingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport2
	 * SecuritiesTransactionReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmitgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmittingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity submitting the transaction report to the competent authority.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubmittingParty = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SubmittingPartyRole.mmObject();
			componentContext_lazy = () -> SecuritiesTransactionReport2.mmObject();
			isDerived = false;
			xmlTag = "SubmitgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmittingParty";
			definition = "Entity submitting the transaction report to the competent authority.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};
	protected RecordTechnicalData2 technicalAttributes;
	/**
	 * Data used for exchanges between national competent authorities, not to be
	 * used by reporting entities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RecordTechnicalData2
	 * RecordTechnicalData2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport2
	 * SecuritiesTransactionReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TechAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data used for exchanges between national competent authorities, not to be used by reporting entities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTechnicalAttributes = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesTransactionReport2.mmObject();
			isDerived = false;
			xmlTag = "TechAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalAttributes";
			definition = "Data used for exchanges between national competent authorities, not to be used by reporting entities.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RecordTechnicalData2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData;
	/**
	 * Additional information that can not be captured in the structured fields
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport2
	 * SecuritiesTransactionReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSupplementaryData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesTransactionReport2.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuritiesTransactionReport2.mmTransactionIdentification, SecuritiesTransactionReport2.mmExecutingParty, SecuritiesTransactionReport2.mmSubmittingParty,
						SecuritiesTransactionReport2.mmTechnicalAttributes, SecuritiesTransactionReport2.mmSupplementaryData);
				trace_lazy = () -> SecuritiesTransaction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionReport2";
				definition = "Details of the securities transaction report.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TxId", required = true)
	public Max52Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(Max52Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	@XmlElement(name = "ExctgPty", required = true)
	public LEIIdentifier getExecutingParty() {
		return executingParty;
	}

	public void setExecutingParty(LEIIdentifier executingParty) {
		this.executingParty = executingParty;
	}

	@XmlElement(name = "SubmitgPty", required = true)
	public LEIIdentifier getSubmittingParty() {
		return submittingParty;
	}

	public void setSubmittingParty(LEIIdentifier submittingParty) {
		this.submittingParty = submittingParty;
	}

	@XmlElement(name = "TechAttrbts")
	public RecordTechnicalData2 getTechnicalAttributes() {
		return technicalAttributes;
	}

	public void setTechnicalAttributes(com.tools20022.repository.msg.RecordTechnicalData2 technicalAttributes) {
		this.technicalAttributes = technicalAttributes;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}