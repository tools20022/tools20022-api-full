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
import com.tools20022.repository.codeset.FormOfSecurity1Code;
import com.tools20022.repository.codeset.PhysicalTransferType1Code;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Overall holding position, in a single financial instrument, held in a
 * securities account at a specified place of safekeeping.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1#mmFinancialInstrumentIdentification
 * AggregateHoldingBalance1.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1#mmHoldingForm
 * AggregateHoldingBalance1.mmHoldingForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1#mmHoldingPhysicalType
 * AggregateHoldingBalance1.mmHoldingPhysicalType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1#mmBalanceForFinancialInstrument
 * AggregateHoldingBalance1.mmBalanceForFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1#mmSupplementaryData
 * AggregateHoldingBalance1.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
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
 * "AggregateHoldingBalance1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Overall holding position, in a single financial instrument, held in a securities account at a specified place of safekeeping."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateHoldingBalance3
 * AggregateHoldingBalance3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AggregateHoldingBalance1", propOrder = {"financialInstrumentIdentification", "holdingForm", "holdingPhysicalType", "balanceForFinancialInstrument", "supplementaryData"})
public class AggregateHoldingBalance1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SecurityIdentification19 financialInstrumentIdentification;
	/**
	 * Identification of the financial instrument for which the balance
	 * information is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1
	 * AggregateHoldingBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the financial instrument for which the balance information is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesIdentification.mmObject();
			componentContext_lazy = () -> AggregateHoldingBalance1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identification of the financial instrument for which the balance information is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification19.mmObject();
		}
	};
	protected FormOfSecurity1Code holdingForm;
	/**
	 * Form of ownership of the holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FormOfSecurity1Code
	 * FormOfSecurity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistrationForm
	 * Security.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1
	 * AggregateHoldingBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Form of ownership of the holding."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHoldingForm = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistrationForm;
			componentContext_lazy = () -> AggregateHoldingBalance1.mmObject();
			isDerived = false;
			xmlTag = "HldgForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingForm";
			definition = "Form of ownership of the holding.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FormOfSecurity1Code.mmObject();
		}
	};
	protected PhysicalTransferType1Code holdingPhysicalType;
	/**
	 * Specifies whether the holding is physically delivered or is a book entry
	 * only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferType1Code
	 * PhysicalTransferType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmType
	 * PhysicalDelivery.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1
	 * AggregateHoldingBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgPhysTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingPhysicalType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the holding is physically delivered or is a book entry only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHoldingPhysicalType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PhysicalDelivery.mmType;
			componentContext_lazy = () -> AggregateHoldingBalance1.mmObject();
			isDerived = false;
			xmlTag = "HldgPhysTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingPhysicalType";
			definition = "Specifies whether the holding is physically delivered or is a book entry only.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PhysicalTransferType1Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1> balanceForFinancialInstrument;
	/**
	 * Balance breakdown on the net position of the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1
	 * FinancialInstrumentAggregateBalance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1
	 * AggregateHoldingBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalForFinInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForFinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance breakdown on the net position of the financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalanceForFinancialInstrument = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AssetHolding.mmObject();
			componentContext_lazy = () -> AggregateHoldingBalance1.mmObject();
			isDerived = false;
			xmlTag = "BalForFinInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForFinancialInstrument";
			definition = "Balance breakdown on the net position of the financial instrument.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
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
	 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1
	 * AggregateHoldingBalance1}</li>
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
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSupplementaryData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AggregateHoldingBalance1.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AggregateHoldingBalance1.mmFinancialInstrumentIdentification, AggregateHoldingBalance1.mmHoldingForm, AggregateHoldingBalance1.mmHoldingPhysicalType,
						AggregateHoldingBalance1.mmBalanceForFinancialInstrument, AggregateHoldingBalance1.mmSupplementaryData);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AggregateHoldingBalance1";
				definition = "Overall holding position, in a single financial instrument, held in a securities account at a specified place of safekeeping.";
				nextVersions_lazy = () -> Arrays.asList(AggregateHoldingBalance3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FinInstrmId", required = true)
	public SecurityIdentification19 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(com.tools20022.repository.msg.SecurityIdentification19 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
	}

	@XmlElement(name = "HldgForm")
	public FormOfSecurity1Code getHoldingForm() {
		return holdingForm;
	}

	public void setHoldingForm(FormOfSecurity1Code holdingForm) {
		this.holdingForm = holdingForm;
	}

	@XmlElement(name = "HldgPhysTp")
	public PhysicalTransferType1Code getHoldingPhysicalType() {
		return holdingPhysicalType;
	}

	public void setHoldingPhysicalType(PhysicalTransferType1Code holdingPhysicalType) {
		this.holdingPhysicalType = holdingPhysicalType;
	}

	@XmlElement(name = "BalForFinInstrm", required = true)
	public List<FinancialInstrumentAggregateBalance1> getBalanceForFinancialInstrument() {
		return balanceForFinancialInstrument;
	}

	public void setBalanceForFinancialInstrument(List<com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1> balanceForFinancialInstrument) {
		this.balanceForFinancialInstrument = balanceForFinancialInstrument;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}