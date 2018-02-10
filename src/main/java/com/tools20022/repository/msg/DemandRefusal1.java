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
import com.tools20022.repository.area.tsrv.DemandRefusalNotificationV01;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Refused7Text;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.entity.UndertakingStatus;
import com.tools20022.repository.entity.UndertakingStatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the refusal of a demand.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DemandRefusal1#mmUndertakingIdentification
 * DemandRefusal1.mmUndertakingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DemandRefusal1#mmAdvisingPartyReferenceNumber
 * DemandRefusal1.mmAdvisingPartyReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DemandRefusal1#mmSecondAdvisingPartyReferenceNumber
 * DemandRefusal1.mmSecondAdvisingPartyReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DemandRefusal1#mmConfirmerReferenceNumber
 * DemandRefusal1.mmConfirmerReferenceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DemandRefusal1#mmDemandDetails
 * DemandRefusal1.mmDemandDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DemandRefusal1#mmStatus
 * DemandRefusal1.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DemandRefusal1#mmDiscrepancy
 * DemandRefusal1.mmDiscrepancy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DemandRefusal1#mmDispositionOfDocuments
 * DemandRefusal1.mmDispositionOfDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DemandRefusal1#mmAdditionalInformation
 * DemandRefusal1.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason
 * UndertakingStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.DemandRefusalNotificationV01#mmDemandRefusalNotificationDetails
 * DemandRefusalNotificationV01.mmDemandRefusalNotificationDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DemandRefusal1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about the refusal of a demand."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DemandRefusal1", propOrder = {"undertakingIdentification", "advisingPartyReferenceNumber", "secondAdvisingPartyReferenceNumber", "confirmerReferenceNumber", "demandDetails", "status", "discrepancy",
		"dispositionOfDocuments", "additionalInformation"})
public class DemandRefusal1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UdrtkgId", required = true)
	protected Undertaking9 undertakingIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Undertaking9
	 * Undertaking9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmUndertaking
	 * UndertakingStatus.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DemandRefusal1 DemandRefusal1}</li>
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
			businessElementTrace_lazy = () -> UndertakingStatus.mmUndertaking;
			componentContext_lazy = () -> com.tools20022.repository.msg.DemandRefusal1.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIdentification";
			definition = "Details related to the identification of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Undertaking9.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.DemandRefusal1 DemandRefusal1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DemandRefusal1.mmObject();
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
	@XmlElement(name = "ScndAdvsgPtyRefNb")
	protected Max35Text secondAdvisingPartyReferenceNumber;
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
	 * {@linkplain com.tools20022.repository.msg.DemandRefusal1 DemandRefusal1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndAdvsgPtyRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondAdvisingPartyReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned by the second advising party to the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecondAdvisingPartyReferenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DemandRefusal1.mmObject();
			isDerived = false;
			xmlTag = "ScndAdvsgPtyRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondAdvisingPartyReferenceNumber";
			definition = "Unique and unambiguous identifier assigned by the second advising party to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.DemandRefusal1 DemandRefusal1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DemandRefusal1.mmObject();
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
	@XmlElement(name = "DmndDtls", required = true)
	protected Demand2 demandDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Demand2 Demand2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmDemand
	 * Undertaking.mmDemand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DemandRefusal1 DemandRefusal1}</li>
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
			businessElementTrace_lazy = () -> Undertaking.mmDemand;
			componentContext_lazy = () -> com.tools20022.repository.msg.DemandRefusal1.mmObject();
			isDerived = false;
			xmlTag = "DmndDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DemandDetails";
			definition = "Details related to the demand.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Demand2.mmObject();
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected Refused7Text status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Refused7Text Refused7Text}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmDemandStatus
	 * UndertakingStatus.mmDemandStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DemandRefusal1 DemandRefusal1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Expicit indication of 'REFUSED' as the processing status reported by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> UndertakingStatus.mmDemandStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.DemandRefusal1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Expicit indication of 'REFUSED' as the processing status reported by the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Refused7Text.mmObject();
		}
	};
	@XmlElement(name = "Dscrpncy")
	protected List<com.tools20022.repository.msg.Discrepancy1> discrepancy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Discrepancy1
	 * Discrepancy1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason#mmDiscrepancy
	 * UndertakingStatusReason.mmDiscrepancy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DemandRefusal1 DemandRefusal1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dscrpncy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discrepancy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the discrepancies."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDiscrepancy = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> UndertakingStatusReason.mmDiscrepancy;
			componentContext_lazy = () -> com.tools20022.repository.msg.DemandRefusal1.mmObject();
			isDerived = false;
			xmlTag = "Dscrpncy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discrepancy";
			definition = "Details related to the discrepancies.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Discrepancy1.mmObject();
		}
	};
	@XmlElement(name = "DspstnOfDocs")
	protected List<Max2000Text> dispositionOfDocuments;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DemandRefusal1 DemandRefusal1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DspstnOfDocs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DispositionOfDocuments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of how the demand presentation documents will be handled as a consequence of the demand refusal."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDispositionOfDocuments = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DemandRefusal1.mmObject();
			isDerived = false;
			xmlTag = "DspstnOfDocs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DispositionOfDocuments";
			definition = "Indication of how the demand presentation documents will be handled as a consequence of the demand refusal.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<Max2000Text> additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DemandRefusal1 DemandRefusal1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information related to the notification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DemandRefusal1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information related to the notification.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DemandRefusal1.mmUndertakingIdentification, com.tools20022.repository.msg.DemandRefusal1.mmAdvisingPartyReferenceNumber,
						com.tools20022.repository.msg.DemandRefusal1.mmSecondAdvisingPartyReferenceNumber, com.tools20022.repository.msg.DemandRefusal1.mmConfirmerReferenceNumber,
						com.tools20022.repository.msg.DemandRefusal1.mmDemandDetails, com.tools20022.repository.msg.DemandRefusal1.mmStatus, com.tools20022.repository.msg.DemandRefusal1.mmDiscrepancy,
						com.tools20022.repository.msg.DemandRefusal1.mmDispositionOfDocuments, com.tools20022.repository.msg.DemandRefusal1.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(DemandRefusalNotificationV01.mmDemandRefusalNotificationDetails);
				trace_lazy = () -> UndertakingStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DemandRefusal1";
				definition = "Information about the refusal of a demand.";
			}
		});
		return mmObject_lazy.get();
	}

	public Undertaking9 getUndertakingIdentification() {
		return undertakingIdentification;
	}

	public DemandRefusal1 setUndertakingIdentification(com.tools20022.repository.msg.Undertaking9 undertakingIdentification) {
		this.undertakingIdentification = Objects.requireNonNull(undertakingIdentification);
		return this;
	}

	public Optional<Max35Text> getAdvisingPartyReferenceNumber() {
		return advisingPartyReferenceNumber == null ? Optional.empty() : Optional.of(advisingPartyReferenceNumber);
	}

	public DemandRefusal1 setAdvisingPartyReferenceNumber(Max35Text advisingPartyReferenceNumber) {
		this.advisingPartyReferenceNumber = advisingPartyReferenceNumber;
		return this;
	}

	public Optional<Max35Text> getSecondAdvisingPartyReferenceNumber() {
		return secondAdvisingPartyReferenceNumber == null ? Optional.empty() : Optional.of(secondAdvisingPartyReferenceNumber);
	}

	public DemandRefusal1 setSecondAdvisingPartyReferenceNumber(Max35Text secondAdvisingPartyReferenceNumber) {
		this.secondAdvisingPartyReferenceNumber = secondAdvisingPartyReferenceNumber;
		return this;
	}

	public Optional<Max35Text> getConfirmerReferenceNumber() {
		return confirmerReferenceNumber == null ? Optional.empty() : Optional.of(confirmerReferenceNumber);
	}

	public DemandRefusal1 setConfirmerReferenceNumber(Max35Text confirmerReferenceNumber) {
		this.confirmerReferenceNumber = confirmerReferenceNumber;
		return this;
	}

	public Demand2 getDemandDetails() {
		return demandDetails;
	}

	public DemandRefusal1 setDemandDetails(com.tools20022.repository.msg.Demand2 demandDetails) {
		this.demandDetails = Objects.requireNonNull(demandDetails);
		return this;
	}

	public Refused7Text getStatus() {
		return status;
	}

	public DemandRefusal1 setStatus(Refused7Text status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public List<Discrepancy1> getDiscrepancy() {
		return discrepancy == null ? discrepancy = new ArrayList<>() : discrepancy;
	}

	public DemandRefusal1 setDiscrepancy(List<com.tools20022.repository.msg.Discrepancy1> discrepancy) {
		this.discrepancy = Objects.requireNonNull(discrepancy);
		return this;
	}

	public List<Max2000Text> getDispositionOfDocuments() {
		return dispositionOfDocuments == null ? dispositionOfDocuments = new ArrayList<>() : dispositionOfDocuments;
	}

	public DemandRefusal1 setDispositionOfDocuments(List<Max2000Text> dispositionOfDocuments) {
		this.dispositionOfDocuments = Objects.requireNonNull(dispositionOfDocuments);
		return this;
	}

	public List<Max2000Text> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public DemandRefusal1 setAdditionalInformation(List<Max2000Text> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}
}