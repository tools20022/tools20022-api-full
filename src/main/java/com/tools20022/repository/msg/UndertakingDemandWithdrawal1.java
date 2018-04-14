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
import com.tools20022.repository.area.tsrv.DemandWithdrawalNotificationV01;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Demand;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Demand3;
import com.tools20022.repository.msg.Undertaking6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the demand withdrawal notification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingDemandWithdrawal1#mmUndertakingIdentification
 * UndertakingDemandWithdrawal1.mmUndertakingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingDemandWithdrawal1#mmAdvisingPartyReferenceNumber
 * UndertakingDemandWithdrawal1.mmAdvisingPartyReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingDemandWithdrawal1#mmDemandDetails
 * UndertakingDemandWithdrawal1.mmDemandDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingDemandWithdrawal1#mmConfirmerReferenceNumber
 * UndertakingDemandWithdrawal1.mmConfirmerReferenceNumber}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Demand Demand}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.DemandWithdrawalNotificationV01#mmDemandWithdrawalNotificationDetails
 * DemandWithdrawalNotificationV01.mmDemandWithdrawalNotificationDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UndertakingDemandWithdrawal1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the demand withdrawal notification."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UndertakingDemandWithdrawal1", propOrder = {"undertakingIdentification", "advisingPartyReferenceNumber", "demandDetails", "confirmerReferenceNumber"})
public class UndertakingDemandWithdrawal1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UdrtkgId", required = true)
	protected Undertaking6 undertakingIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Undertaking6
	 * Undertaking6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Demand#mmUndertaking
	 * Demand.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingDemandWithdrawal1
	 * UndertakingDemandWithdrawal1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the identification of the undertaking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UndertakingDemandWithdrawal1, Undertaking6> mmUndertakingIdentification = new MMMessageAssociationEnd<UndertakingDemandWithdrawal1, Undertaking6>() {
		{
			businessElementTrace_lazy = () -> Demand.mmUndertaking;
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingDemandWithdrawal1.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIdentification";
			definition = "Details related to the identification of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Undertaking6.mmObject();
		}

		@Override
		public Undertaking6 getValue(UndertakingDemandWithdrawal1 obj) {
			return obj.getUndertakingIdentification();
		}

		@Override
		public void setValue(UndertakingDemandWithdrawal1 obj, Undertaking6 value) {
			obj.setUndertakingIdentification(value);
		}
	};
	@XmlElement(name = "AdvsgPtyRefNb")
	protected Max35Text advisingPartyReferenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingDemandWithdrawal1
	 * UndertakingDemandWithdrawal1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdvsgPtyRefNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdvisingPartyReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned by the advising party to the undertaking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UndertakingDemandWithdrawal1, Optional<Max35Text>> mmAdvisingPartyReferenceNumber = new MMMessageAttribute<UndertakingDemandWithdrawal1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingDemandWithdrawal1.mmObject();
			isDerived = false;
			xmlTag = "AdvsgPtyRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdvisingPartyReferenceNumber";
			definition = "Unique and unambiguous identifier assigned by the advising party to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(UndertakingDemandWithdrawal1 obj) {
			return obj.getAdvisingPartyReferenceNumber();
		}

		@Override
		public void setValue(UndertakingDemandWithdrawal1 obj, Optional<Max35Text> value) {
			obj.setAdvisingPartyReferenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "DmndDtls", required = true)
	protected Demand3 demandDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Demand3 Demand3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Demand Demand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingDemandWithdrawal1
	 * UndertakingDemandWithdrawal1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DmndDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DemandDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the demand."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UndertakingDemandWithdrawal1, Demand3> mmDemandDetails = new MMMessageAssociationEnd<UndertakingDemandWithdrawal1, Demand3>() {
		{
			businessComponentTrace_lazy = () -> Demand.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingDemandWithdrawal1.mmObject();
			isDerived = false;
			xmlTag = "DmndDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DemandDetails";
			definition = "Details related to the demand.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Demand3.mmObject();
		}

		@Override
		public Demand3 getValue(UndertakingDemandWithdrawal1 obj) {
			return obj.getDemandDetails();
		}

		@Override
		public void setValue(UndertakingDemandWithdrawal1 obj, Demand3 value) {
			obj.setDemandDetails(value);
		}
	};
	@XmlElement(name = "CnfrmrRefNb")
	protected Max35Text confirmerReferenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingDemandWithdrawal1
	 * UndertakingDemandWithdrawal1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnfrmrRefNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmerReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned by the confirmer to the undertaking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UndertakingDemandWithdrawal1, Optional<Max35Text>> mmConfirmerReferenceNumber = new MMMessageAttribute<UndertakingDemandWithdrawal1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingDemandWithdrawal1.mmObject();
			isDerived = false;
			xmlTag = "CnfrmrRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmerReferenceNumber";
			definition = "Unique and unambiguous identifier assigned by the confirmer to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(UndertakingDemandWithdrawal1 obj) {
			return obj.getConfirmerReferenceNumber();
		}

		@Override
		public void setValue(UndertakingDemandWithdrawal1 obj, Optional<Max35Text> value) {
			obj.setConfirmerReferenceNumber(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UndertakingDemandWithdrawal1.mmUndertakingIdentification, com.tools20022.repository.msg.UndertakingDemandWithdrawal1.mmAdvisingPartyReferenceNumber,
						com.tools20022.repository.msg.UndertakingDemandWithdrawal1.mmDemandDetails, com.tools20022.repository.msg.UndertakingDemandWithdrawal1.mmConfirmerReferenceNumber);
				messageBuildingBlock_lazy = () -> Arrays.asList(DemandWithdrawalNotificationV01.mmDemandWithdrawalNotificationDetails);
				trace_lazy = () -> Demand.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingDemandWithdrawal1";
				definition = "Details of the demand withdrawal notification.";
			}
		});
		return mmObject_lazy.get();
	}

	public Undertaking6 getUndertakingIdentification() {
		return undertakingIdentification;
	}

	public UndertakingDemandWithdrawal1 setUndertakingIdentification(Undertaking6 undertakingIdentification) {
		this.undertakingIdentification = Objects.requireNonNull(undertakingIdentification);
		return this;
	}

	public Optional<Max35Text> getAdvisingPartyReferenceNumber() {
		return advisingPartyReferenceNumber == null ? Optional.empty() : Optional.of(advisingPartyReferenceNumber);
	}

	public UndertakingDemandWithdrawal1 setAdvisingPartyReferenceNumber(Max35Text advisingPartyReferenceNumber) {
		this.advisingPartyReferenceNumber = advisingPartyReferenceNumber;
		return this;
	}

	public Demand3 getDemandDetails() {
		return demandDetails;
	}

	public UndertakingDemandWithdrawal1 setDemandDetails(Demand3 demandDetails) {
		this.demandDetails = Objects.requireNonNull(demandDetails);
		return this;
	}

	public Optional<Max35Text> getConfirmerReferenceNumber() {
		return confirmerReferenceNumber == null ? Optional.empty() : Optional.of(confirmerReferenceNumber);
	}

	public UndertakingDemandWithdrawal1 setConfirmerReferenceNumber(Max35Text confirmerReferenceNumber) {
		this.confirmerReferenceNumber = confirmerReferenceNumber;
		return this;
	}
}