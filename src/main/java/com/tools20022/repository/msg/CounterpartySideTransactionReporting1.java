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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.ReportingPartyRole;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This is regulatory transaction reporting information from the counterparty
 * side party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CounterpartySideTransactionReporting1#mmReportingJurisdiction
 * CounterpartySideTransactionReporting1.mmReportingJurisdiction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CounterpartySideTransactionReporting1#mmReportingParty
 * CounterpartySideTransactionReporting1.mmReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CounterpartySideTransactionReporting1#mmCounterpartySideUniqueTransactionIdentifier
 * CounterpartySideTransactionReporting1.
 * mmCounterpartySideUniqueTransactionIdentifier}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ReportingPartyRole
 * ReportingPartyRole}</li>
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
 * "CounterpartySideTransactionReporting1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "This is regulatory transaction reporting information from the counterparty side party."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CounterpartySideTransactionReporting1", propOrder = {"reportingJurisdiction", "reportingParty", "counterpartySideUniqueTransactionIdentifier"})
public class CounterpartySideTransactionReporting1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text reportingJurisdiction;
	/**
	 * Specifies the supervisory party to which the trade needs to be reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CounterpartySideTransactionReporting1
	 * CounterpartySideTransactionReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgJursdctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingJurisdiction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the supervisory party to which the trade needs to be reported."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportingJurisdiction = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> CounterpartySideTransactionReporting1.mmObject();
			isDerived = false;
			xmlTag = "RptgJursdctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingJurisdiction";
			definition = "Specifies the supervisory party to which the trade needs to be reported.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyIdentification73Choice reportingParty;
	/**
	 * Identifies the party that is responsible for reporting the trade to the
	 * trade repository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CounterpartySideTransactionReporting1
	 * CounterpartySideTransactionReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party that is responsible for reporting the trade to the trade repository."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportingParty = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> CounterpartySideTransactionReporting1.mmObject();
			isDerived = false;
			xmlTag = "RptgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingParty";
			definition = "Identifies the party that is responsible for reporting the trade to the trade repository.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification73Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.UniqueTransactionIdentifier2> counterpartySideUniqueTransactionIdentifier;
	/**
	 * Specifies the unique transaction identifier (UTI) to be created at the
	 * time a transaction is first executed, shared with all registered entities
	 * and counterparties involved in the transaction, and used to track that
	 * particular transaction over its life. This identifier can also be known
	 * as the Unique Swap Identifier (USI). This is the UTI from the
	 * Counterparty Side party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UniqueTransactionIdentifier2
	 * UniqueTransactionIdentifier2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeRelatedIdentifications
	 * Trade.mmTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CounterpartySideTransactionReporting1
	 * CounterpartySideTransactionReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtySdUnqTxIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartySideUniqueTransactionIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the unique transaction identifier (UTI) to be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction over its life. This identifier can also be known as the Unique Swap Identifier (USI). This is the UTI from the Counterparty Side party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCounterpartySideUniqueTransactionIdentifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeRelatedIdentifications;
			componentContext_lazy = () -> CounterpartySideTransactionReporting1.mmObject();
			isDerived = false;
			xmlTag = "CtrPtySdUnqTxIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideUniqueTransactionIdentifier";
			definition = "Specifies the unique transaction identifier (UTI) to be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction over its life. This identifier can also be known as the Unique Swap Identifier (USI). This is the UTI from the Counterparty Side party.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.UniqueTransactionIdentifier2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CounterpartySideTransactionReporting1.mmReportingJurisdiction, CounterpartySideTransactionReporting1.mmReportingParty,
						CounterpartySideTransactionReporting1.mmCounterpartySideUniqueTransactionIdentifier);
				trace_lazy = () -> ReportingPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CounterpartySideTransactionReporting1";
				definition = "This is regulatory transaction reporting information from the counterparty side party.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RptgJursdctn")
	public Max35Text getReportingJurisdiction() {
		return reportingJurisdiction;
	}

	public void setReportingJurisdiction(Max35Text reportingJurisdiction) {
		this.reportingJurisdiction = reportingJurisdiction;
	}

	@XmlElement(name = "RptgPty")
	public PartyIdentification73Choice getReportingParty() {
		return reportingParty;
	}

	public void setReportingParty(PartyIdentification73Choice reportingParty) {
		this.reportingParty = reportingParty;
	}

	@XmlElement(name = "CtrPtySdUnqTxIdr")
	public List<UniqueTransactionIdentifier2> getCounterpartySideUniqueTransactionIdentifier() {
		return counterpartySideUniqueTransactionIdentifier;
	}

	public void setCounterpartySideUniqueTransactionIdentifier(List<com.tools20022.repository.msg.UniqueTransactionIdentifier2> counterpartySideUniqueTransactionIdentifier) {
		this.counterpartySideUniqueTransactionIdentifier = counterpartySideUniqueTransactionIdentifier;
	}
}