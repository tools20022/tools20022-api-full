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
import com.tools20022.repository.area.seev.AgentCANotificationAdviceV01;
import com.tools20022.repository.choice.DateFormat4Choice;
import com.tools20022.repository.choice.ProcessingStatus1FormatChoice;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.CorporateActionEventRegistration;
import com.tools20022.repository.entity.CorporateActionNotification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the notification advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1#mmAnnouncementDate
 * CorporateActionNotification1.mmAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1#mmFurtherDetailedAnnouncementDate
 * CorporateActionNotification1.mmFurtherDetailedAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1#mmOfficialAnnouncementPublicationDate
 * CorporateActionNotification1.mmOfficialAnnouncementPublicationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1#mmProcessingStatus
 * CorporateActionNotification1.mmProcessingStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification
 * CorporateActionNotification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationAdviceV01#mmNotificationGeneralInformation
 * AgentCANotificationAdviceV01.mmNotificationGeneralInformation}</li>
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
 * "CorporateActionNotification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the notification advice."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionNotification1", propOrder = {"announcementDate", "furtherDetailedAnnouncementDate", "officialAnnouncementPublicationDate", "processingStatus"})
public class CorporateActionNotification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DateFormat4Choice announcementDate;
	/**
	 * Date/time at which the issuer announced that a corporate action event
	 * will occur.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmAnnouncementDate
	 * CorporateActionEvent.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1
	 * CorporateActionNotification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnncmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the issuer announced that a corporate action event will occur."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAnnouncementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmAnnouncementDate;
			componentContext_lazy = () -> CorporateActionNotification1.mmObject();
			isDerived = false;
			xmlTag = "AnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncementDate";
			definition = "Date/time at which the issuer announced that a corporate action event will occur.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}
	};
	protected DateFormat4Choice furtherDetailedAnnouncementDate;
	/**
	 * Date/time at which additional information on the event will be announced,
	 * eg, exchange ratio announcement date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmFurtherDetailsAnnouncementDate
	 * CorporateActionEvent.mmFurtherDetailsAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1
	 * CorporateActionNotification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrthrDtldAnncmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FurtherDetailedAnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which additional information on the event will be announced, eg, exchange ratio announcement date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFurtherDetailedAnnouncementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmFurtherDetailsAnnouncementDate;
			componentContext_lazy = () -> CorporateActionNotification1.mmObject();
			isDerived = false;
			xmlTag = "FrthrDtldAnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FurtherDetailedAnnouncementDate";
			definition = "Date/time at which additional information on the event will be announced, eg, exchange ratio announcement date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}
	};
	protected DateFormat4Choice officialAnnouncementPublicationDate;
	/**
	 * Date/time at which the corporate action is legally announced by an
	 * official body, eg, publication by a governmental administration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmOfficialAnnouncementPublicationDate
	 * CorporateActionEventRegistration.mmOfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1
	 * CorporateActionNotification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OffclAnncmntPblctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialAnnouncementPublicationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the corporate action is legally announced by an official body, eg, publication by a governmental administration."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOfficialAnnouncementPublicationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEventRegistration.mmOfficialAnnouncementPublicationDate;
			componentContext_lazy = () -> CorporateActionNotification1.mmObject();
			isDerived = false;
			xmlTag = "OffclAnncmntPblctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialAnnouncementPublicationDate";
			definition = "Date/time at which the corporate action is legally announced by an official body, eg, publication by a governmental administration.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}
	};
	protected ProcessingStatus1FormatChoice processingStatus;
	/**
	 * Specifies the status of the details of the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus1FormatChoice
	 * ProcessingStatus1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionStatus
	 * CorporateActionEvent.mmCorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1
	 * CorporateActionNotification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the details of the event."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProcessingStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionStatus;
			componentContext_lazy = () -> CorporateActionNotification1.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Specifies the status of the details of the event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ProcessingStatus1FormatChoice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionNotification1.mmAnnouncementDate, CorporateActionNotification1.mmFurtherDetailedAnnouncementDate, CorporateActionNotification1.mmOfficialAnnouncementPublicationDate,
						CorporateActionNotification1.mmProcessingStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCANotificationAdviceV01.mmNotificationGeneralInformation);
				trace_lazy = () -> CorporateActionNotification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNotification1";
				definition = "Provides information about the notification advice.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AnncmntDt")
	public DateFormat4Choice getAnnouncementDate() {
		return announcementDate;
	}

	public void setAnnouncementDate(DateFormat4Choice announcementDate) {
		this.announcementDate = announcementDate;
	}

	@XmlElement(name = "FrthrDtldAnncmntDt")
	public DateFormat4Choice getFurtherDetailedAnnouncementDate() {
		return furtherDetailedAnnouncementDate;
	}

	public void setFurtherDetailedAnnouncementDate(DateFormat4Choice furtherDetailedAnnouncementDate) {
		this.furtherDetailedAnnouncementDate = furtherDetailedAnnouncementDate;
	}

	@XmlElement(name = "OffclAnncmntPblctnDt")
	public DateFormat4Choice getOfficialAnnouncementPublicationDate() {
		return officialAnnouncementPublicationDate;
	}

	public void setOfficialAnnouncementPublicationDate(DateFormat4Choice officialAnnouncementPublicationDate) {
		this.officialAnnouncementPublicationDate = officialAnnouncementPublicationDate;
	}

	@XmlElement(name = "PrcgSts", required = true)
	public ProcessingStatus1FormatChoice getProcessingStatus() {
		return processingStatus;
	}

	public void setProcessingStatus(ProcessingStatus1FormatChoice processingStatus) {
		this.processingStatus = processingStatus;
	}
}