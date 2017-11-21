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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UndertakingDemandWithdrawal1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the demand withdrawal notification."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "UndertakingDemandWithdrawal1", propOrder = {"undertakingIdentification", "advisingPartyReferenceNumber", "demandDetails", "confirmerReferenceNumber"})
public class UndertakingDemandWithdrawal1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Undertaking6 undertakingIdentification;
	/**
	 * Details related to the identification of the undertaking.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the identification of the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUndertakingIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Demand.mmUndertaking;
			componentContext_lazy = () -> UndertakingDemandWithdrawal1.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIdentification";
			definition = "Details related to the identification of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Undertaking6.mmObject();
		}
	};
	protected Max35Text advisingPartyReferenceNumber;
	/**
	 * Unique and unambiguous identifier assigned by the advising party to the
	 * undertaking.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdvisingPartyReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned by the advising party to the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdvisingPartyReferenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UndertakingDemandWithdrawal1.mmObject();
			isDerived = false;
			xmlTag = "AdvsgPtyRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdvisingPartyReferenceNumber";
			definition = "Unique and unambiguous identifier assigned by the advising party to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Demand3 demandDetails;
	/**
	 * Details related to the demand.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DemandDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the demand."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDemandDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Demand.mmObject();
			componentContext_lazy = () -> UndertakingDemandWithdrawal1.mmObject();
			isDerived = false;
			xmlTag = "DmndDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DemandDetails";
			definition = "Details related to the demand.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Demand3.mmObject();
		}
	};
	protected Max35Text confirmerReferenceNumber;
	/**
	 * Unique and unambiguous identifier assigned by the confirmer to the
	 * undertaking.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmerReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned by the confirmer to the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConfirmerReferenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UndertakingDemandWithdrawal1.mmObject();
			isDerived = false;
			xmlTag = "CnfrmrRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmerReferenceNumber";
			definition = "Unique and unambiguous identifier assigned by the confirmer to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(UndertakingDemandWithdrawal1.mmUndertakingIdentification, UndertakingDemandWithdrawal1.mmAdvisingPartyReferenceNumber, UndertakingDemandWithdrawal1.mmDemandDetails,
						UndertakingDemandWithdrawal1.mmConfirmerReferenceNumber);
				messageBuildingBlock_lazy = () -> Arrays.asList(DemandWithdrawalNotificationV01.mmDemandWithdrawalNotificationDetails);
				trace_lazy = () -> Demand.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingDemandWithdrawal1";
				definition = "Details of the demand withdrawal notification.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "UdrtkgId", required = true)
	public Undertaking6 getUndertakingIdentification() {
		return undertakingIdentification;
	}

	public void setUndertakingIdentification(com.tools20022.repository.msg.Undertaking6 undertakingIdentification) {
		this.undertakingIdentification = undertakingIdentification;
	}

	@XmlElement(name = "AdvsgPtyRefNb")
	public Max35Text getAdvisingPartyReferenceNumber() {
		return advisingPartyReferenceNumber;
	}

	public void setAdvisingPartyReferenceNumber(Max35Text advisingPartyReferenceNumber) {
		this.advisingPartyReferenceNumber = advisingPartyReferenceNumber;
	}

	@XmlElement(name = "DmndDtls", required = true)
	public Demand3 getDemandDetails() {
		return demandDetails;
	}

	public void setDemandDetails(com.tools20022.repository.msg.Demand3 demandDetails) {
		this.demandDetails = demandDetails;
	}

	@XmlElement(name = "CnfrmrRefNb")
	public Max35Text getConfirmerReferenceNumber() {
		return confirmerReferenceNumber;
	}

	public void setConfirmerReferenceNumber(Max35Text confirmerReferenceNumber) {
		this.confirmerReferenceNumber = confirmerReferenceNumber;
	}
}