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
import com.tools20022.repository.area.seev.MeetingNotificationV03;
import com.tools20022.repository.area.seev.MeetingNotificationV04;
import com.tools20022.repository.choice.DateFormat2Choice;
import com.tools20022.repository.choice.DateFormat3Choice;
import com.tools20022.repository.choice.Entitlement1Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.Deadline;
import com.tools20022.repository.entity.MeetingEntitlement;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the parameters, such as dates, used to calculate the entitlement to
 * vote at a general meeting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmSecuritiesBlockingDeadline
 * EntitlementAssessment2.mmSecuritiesBlockingDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmSecuritiesBlockingSTPDeadline
 * EntitlementAssessment2.mmSecuritiesBlockingSTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmSecuritiesBlockingMarketDeadline
 * EntitlementAssessment2.mmSecuritiesBlockingMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmSecuritiesBlockingPeriodEndDate
 * EntitlementAssessment2.mmSecuritiesBlockingPeriodEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmEntitlementFixingDate
 * EntitlementAssessment2.mmEntitlementFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmRegistrationSecuritiesDeadline
 * EntitlementAssessment2.mmRegistrationSecuritiesDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmRegistrationSecuritiesSTPDeadline
 * EntitlementAssessment2.mmRegistrationSecuritiesSTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmRegistrationSecuritiesMarketDeadline
 * EntitlementAssessment2.mmRegistrationSecuritiesMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmRegistrationParticipationDeadline
 * EntitlementAssessment2.mmRegistrationParticipationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmRegistrationParticipationSTPDeadline
 * EntitlementAssessment2.mmRegistrationParticipationSTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmRegistrationParticipationMarketDeadline
 * EntitlementAssessment2.mmRegistrationParticipationMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmEntitlement
 * EntitlementAssessment2.mmEntitlement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MeetingEntitlement
 * MeetingEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03#mmEntitlementSpecification
 * MeetingNotificationV03.mmEntitlementSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmEntitlementSpecification
 * MeetingNotificationV04.mmEntitlementSpecification}</li>
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
 * "EntitlementAssessment2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the parameters, such as dates, used to calculate the entitlement to vote at a general meeting."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.EntitlementAssessment3
 * EntitlementAssessment3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "EntitlementAssessment2", propOrder = {"securitiesBlockingDeadline", "securitiesBlockingSTPDeadline", "securitiesBlockingMarketDeadline", "securitiesBlockingPeriodEndDate", "entitlementFixingDate",
		"registrationSecuritiesDeadline", "registrationSecuritiesSTPDeadline", "registrationSecuritiesMarketDeadline", "registrationParticipationDeadline", "registrationParticipationSTPDeadline", "registrationParticipationMarketDeadline",
		"entitlement"})
public class EntitlementAssessment2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DateFormat2Choice securitiesBlockingDeadline;
	/**
	 * Date by which the securities should be blocked. This deadline is set by
	 * an intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
	 * Deadline.mmIntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2
	 * EntitlementAssessment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesBlckgDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBlockingDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the securities should be blocked. This deadline is set by an intermediary."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmSecuritiesBlockingDeadline
	 * EntitlementAssessment3.mmSecuritiesBlockingDeadline}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesBlockingDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> EntitlementAssessment2.mmObject();
			isDerived = false;
			xmlTag = "SctiesBlckgDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlockingDeadline";
			definition = "Date by which the securities should be blocked. This deadline is set by an intermediary.";
			nextVersions_lazy = () -> Arrays.asList(EntitlementAssessment3.mmSecuritiesBlockingDeadline);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	protected DateFormat2Choice securitiesBlockingSTPDeadline;
	/**
	 * Date by which the securities should be blocked. This deadline is set by
	 * the issuer. (STP mode)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmSTPDeadline
	 * Deadline.mmSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2
	 * EntitlementAssessment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesBlckgSTPDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBlockingSTPDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the securities should be blocked. This deadline is set by the issuer. (STP mode)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmSecuritiesBlockingSTPDeadline
	 * EntitlementAssessment3.mmSecuritiesBlockingSTPDeadline}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesBlockingSTPDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmSTPDeadline;
			componentContext_lazy = () -> EntitlementAssessment2.mmObject();
			isDerived = false;
			xmlTag = "SctiesBlckgSTPDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlockingSTPDeadline";
			definition = "Date by which the securities should be blocked. This deadline is set by the issuer. (STP mode)";
			nextVersions_lazy = () -> Arrays.asList(EntitlementAssessment3.mmSecuritiesBlockingSTPDeadline);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	protected DateFormat2Choice securitiesBlockingMarketDeadline;
	/**
	 * Date by which the securities should be blocked. This deadline is set by
	 * the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2
	 * EntitlementAssessment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesBlckgMktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBlockingMarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the securities should be blocked. This deadline is set by the issuer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmSecuritiesBlockingMarketDeadline
	 * EntitlementAssessment3.mmSecuritiesBlockingMarketDeadline}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesBlockingMarketDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> EntitlementAssessment2.mmObject();
			isDerived = false;
			xmlTag = "SctiesBlckgMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlockingMarketDeadline";
			definition = "Date by which the securities should be blocked. This deadline is set by the issuer.";
			nextVersions_lazy = () -> Arrays.asList(EntitlementAssessment3.mmSecuritiesBlockingMarketDeadline);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	protected ISODateTime securitiesBlockingPeriodEndDate;
	/**
	 * Date by which the blocking period for the securities should end.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmToDateTime
	 * DateTimePeriod.mmToDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2
	 * EntitlementAssessment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesBlckgPrdEndDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBlockingPeriodEndDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the blocking period for the securities should end."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmSecuritiesBlockingPeriodEndDate
	 * EntitlementAssessment3.mmSecuritiesBlockingPeriodEndDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesBlockingPeriodEndDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmToDateTime;
			componentContext_lazy = () -> EntitlementAssessment2.mmObject();
			isDerived = false;
			xmlTag = "SctiesBlckgPrdEndDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlockingPeriodEndDate";
			definition = "Date by which the blocking period for the securities should end.";
			nextVersions_lazy = () -> Arrays.asList(EntitlementAssessment3.mmSecuritiesBlockingPeriodEndDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected DateFormat3Choice entitlementFixingDate;
	/**
	 * Date at which the positions are struck to note which parties will receive
	 * the entitlement, e.g. record date, book close date...
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat3Choice
	 * DateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#mmEntitlementFixingDate
	 * MeetingEntitlement.mmEntitlementFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2
	 * EntitlementAssessment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitlmntFxgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitlementFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the positions are struck to note which parties will receive the entitlement, e.g. record date, book close date..."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmEntitlementFixingDate
	 * EntitlementAssessment3.mmEntitlementFixingDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntitlementFixingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MeetingEntitlement.mmEntitlementFixingDate;
			componentContext_lazy = () -> EntitlementAssessment2.mmObject();
			isDerived = false;
			xmlTag = "EntitlmntFxgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementFixingDate";
			definition = "Date at which the positions are struck to note which parties will receive the entitlement, e.g. record date, book close date...";
			nextVersions_lazy = () -> Arrays.asList(EntitlementAssessment3.mmEntitlementFixingDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat3Choice.mmObject();
		}
	};
	protected DateFormat2Choice registrationSecuritiesDeadline;
	/**
	 * Date by which the securities have to be registered. This deadline is
	 * specified by an intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
	 * Deadline.mmIntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2
	 * EntitlementAssessment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnSctiesDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationSecuritiesDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the securities have to be registered. This deadline is specified by an intermediary."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationSecuritiesDeadline
	 * EntitlementAssessment3.mmRegistrationSecuritiesDeadline}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationSecuritiesDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> EntitlementAssessment2.mmObject();
			isDerived = false;
			xmlTag = "RegnSctiesDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationSecuritiesDeadline";
			definition = "Date by which the securities have to be registered. This deadline is specified by an intermediary.";
			nextVersions_lazy = () -> Arrays.asList(EntitlementAssessment3.mmRegistrationSecuritiesDeadline);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	protected DateFormat2Choice registrationSecuritiesSTPDeadline;
	/**
	 * Date by which the securities have to be registered. This deadline is
	 * specified by an intermediary (STP mode).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmSTPDeadline
	 * Deadline.mmSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2
	 * EntitlementAssessment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnSctiesSTPDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationSecuritiesSTPDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the securities have to be registered. This deadline is specified by an intermediary (STP mode)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationSecuritiesSTPDeadline
	 * EntitlementAssessment3.mmRegistrationSecuritiesSTPDeadline}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationSecuritiesSTPDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmSTPDeadline;
			componentContext_lazy = () -> EntitlementAssessment2.mmObject();
			isDerived = false;
			xmlTag = "RegnSctiesSTPDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationSecuritiesSTPDeadline";
			definition = "Date by which the securities have to be registered. This deadline is specified by an intermediary (STP mode).";
			nextVersions_lazy = () -> Arrays.asList(EntitlementAssessment3.mmRegistrationSecuritiesSTPDeadline);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	protected DateFormat2Choice registrationSecuritiesMarketDeadline;
	/**
	 * Date by which the securities have to be registered. This deadline is set
	 * by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2
	 * EntitlementAssessment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnSctiesMktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationSecuritiesMarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the securities have to be registered. This deadline is set by the issuer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationSecuritiesMarketDeadline
	 * EntitlementAssessment3.mmRegistrationSecuritiesMarketDeadline}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationSecuritiesMarketDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> EntitlementAssessment2.mmObject();
			isDerived = false;
			xmlTag = "RegnSctiesMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationSecuritiesMarketDeadline";
			definition = "Date by which the securities have to be registered. This deadline is set by the issuer.";
			nextVersions_lazy = () -> Arrays.asList(EntitlementAssessment3.mmRegistrationSecuritiesMarketDeadline);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	protected DateFormat2Choice registrationParticipationDeadline;
	/**
	 * Date by which the holder needs to register its intention to participate
	 * in the meeting process in order to be allowed to participate in the
	 * meeting event. This deadline is specified by an intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
	 * Deadline.mmIntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2
	 * EntitlementAssessment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnPrtcptnDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationParticipationDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the holder needs to register its intention to participate in the meeting process in order to be allowed to participate in the meeting event. This deadline is specified by an intermediary."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationParticipationDeadline
	 * EntitlementAssessment3.mmRegistrationParticipationDeadline}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationParticipationDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> EntitlementAssessment2.mmObject();
			isDerived = false;
			xmlTag = "RegnPrtcptnDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationParticipationDeadline";
			definition = "Date by which the holder needs to register its intention to participate in the meeting process in order to be allowed to participate in the meeting event. This deadline is specified by an intermediary.";
			nextVersions_lazy = () -> Arrays.asList(EntitlementAssessment3.mmRegistrationParticipationDeadline);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	protected DateFormat2Choice registrationParticipationSTPDeadline;
	/**
	 * Date by which the holder needs to register its intention to participate
	 * in the meeting process in order to be allowed to participate in the
	 * meeting event. This deadline is specified by an intermediary (STP mode).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmSTPDeadline
	 * Deadline.mmSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2
	 * EntitlementAssessment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnPrtcptnSTPDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationParticipationSTPDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the holder needs to register its intention to participate in the meeting process in order to be allowed to participate in the meeting event. This deadline is specified by an intermediary (STP mode)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationParticipationSTPDeadline
	 * EntitlementAssessment3.mmRegistrationParticipationSTPDeadline}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationParticipationSTPDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmSTPDeadline;
			componentContext_lazy = () -> EntitlementAssessment2.mmObject();
			isDerived = false;
			xmlTag = "RegnPrtcptnSTPDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationParticipationSTPDeadline";
			definition = "Date by which the holder needs to register its intention to participate in the meeting process in order to be allowed to participate in the meeting event. This deadline is specified by an intermediary (STP mode).";
			nextVersions_lazy = () -> Arrays.asList(EntitlementAssessment3.mmRegistrationParticipationSTPDeadline);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	protected DateFormat2Choice registrationParticipationMarketDeadline;
	/**
	 * Date by which the holder needs to register its intention to participate
	 * in the meeting process in order to be allowed to participate in the
	 * meeting event. This deadline is set by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2
	 * EntitlementAssessment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnPrtcptnMktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationParticipationMarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the holder needs to register its intention to participate in the meeting process in order to be allowed to participate in the meeting event. This deadline is set by the issuer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationParticipationMarketDeadline
	 * EntitlementAssessment3.mmRegistrationParticipationMarketDeadline}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationParticipationMarketDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> EntitlementAssessment2.mmObject();
			isDerived = false;
			xmlTag = "RegnPrtcptnMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationParticipationMarketDeadline";
			definition = "Date by which the holder needs to register its intention to participate in the meeting process in order to be allowed to participate in the meeting event. This deadline is set by the issuer.";
			nextVersions_lazy = () -> Arrays.asList(EntitlementAssessment3.mmRegistrationParticipationMarketDeadline);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	protected Entitlement1Choice entitlement;
	/**
	 * Number of votes assigned to one security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Entitlement1Choice
	 * Entitlement1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement
	 * MeetingEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2
	 * EntitlementAssessment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Entitlmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes assigned to one security."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmEntitlement
	 * EntitlementAssessment3.mmEntitlement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntitlement = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> MeetingEntitlement.mmObject();
			componentContext_lazy = () -> EntitlementAssessment2.mmObject();
			isDerived = false;
			xmlTag = "Entitlmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Entitlement";
			definition = "Number of votes assigned to one security.";
			nextVersions_lazy = () -> Arrays.asList(EntitlementAssessment3.mmEntitlement);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Entitlement1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(EntitlementAssessment2.mmSecuritiesBlockingDeadline, EntitlementAssessment2.mmSecuritiesBlockingSTPDeadline, EntitlementAssessment2.mmSecuritiesBlockingMarketDeadline,
						EntitlementAssessment2.mmSecuritiesBlockingPeriodEndDate, EntitlementAssessment2.mmEntitlementFixingDate, EntitlementAssessment2.mmRegistrationSecuritiesDeadline,
						EntitlementAssessment2.mmRegistrationSecuritiesSTPDeadline, EntitlementAssessment2.mmRegistrationSecuritiesMarketDeadline, EntitlementAssessment2.mmRegistrationParticipationDeadline,
						EntitlementAssessment2.mmRegistrationParticipationSTPDeadline, EntitlementAssessment2.mmRegistrationParticipationMarketDeadline, EntitlementAssessment2.mmEntitlement);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingNotificationV03.mmEntitlementSpecification, MeetingNotificationV04.mmEntitlementSpecification);
				trace_lazy = () -> MeetingEntitlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EntitlementAssessment2";
				definition = "Specifies the parameters, such as dates, used to calculate the entitlement to vote at a general meeting.";
				nextVersions_lazy = () -> Arrays.asList(EntitlementAssessment3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SctiesBlckgDdln")
	public DateFormat2Choice getSecuritiesBlockingDeadline() {
		return securitiesBlockingDeadline;
	}

	public void setSecuritiesBlockingDeadline(DateFormat2Choice securitiesBlockingDeadline) {
		this.securitiesBlockingDeadline = securitiesBlockingDeadline;
	}

	@XmlElement(name = "SctiesBlckgSTPDdln")
	public DateFormat2Choice getSecuritiesBlockingSTPDeadline() {
		return securitiesBlockingSTPDeadline;
	}

	public void setSecuritiesBlockingSTPDeadline(DateFormat2Choice securitiesBlockingSTPDeadline) {
		this.securitiesBlockingSTPDeadline = securitiesBlockingSTPDeadline;
	}

	@XmlElement(name = "SctiesBlckgMktDdln")
	public DateFormat2Choice getSecuritiesBlockingMarketDeadline() {
		return securitiesBlockingMarketDeadline;
	}

	public void setSecuritiesBlockingMarketDeadline(DateFormat2Choice securitiesBlockingMarketDeadline) {
		this.securitiesBlockingMarketDeadline = securitiesBlockingMarketDeadline;
	}

	@XmlElement(name = "SctiesBlckgPrdEndDt")
	public ISODateTime getSecuritiesBlockingPeriodEndDate() {
		return securitiesBlockingPeriodEndDate;
	}

	public void setSecuritiesBlockingPeriodEndDate(ISODateTime securitiesBlockingPeriodEndDate) {
		this.securitiesBlockingPeriodEndDate = securitiesBlockingPeriodEndDate;
	}

	@XmlElement(name = "EntitlmntFxgDt")
	public DateFormat3Choice getEntitlementFixingDate() {
		return entitlementFixingDate;
	}

	public void setEntitlementFixingDate(DateFormat3Choice entitlementFixingDate) {
		this.entitlementFixingDate = entitlementFixingDate;
	}

	@XmlElement(name = "RegnSctiesDdln")
	public DateFormat2Choice getRegistrationSecuritiesDeadline() {
		return registrationSecuritiesDeadline;
	}

	public void setRegistrationSecuritiesDeadline(DateFormat2Choice registrationSecuritiesDeadline) {
		this.registrationSecuritiesDeadline = registrationSecuritiesDeadline;
	}

	@XmlElement(name = "RegnSctiesSTPDdln")
	public DateFormat2Choice getRegistrationSecuritiesSTPDeadline() {
		return registrationSecuritiesSTPDeadline;
	}

	public void setRegistrationSecuritiesSTPDeadline(DateFormat2Choice registrationSecuritiesSTPDeadline) {
		this.registrationSecuritiesSTPDeadline = registrationSecuritiesSTPDeadline;
	}

	@XmlElement(name = "RegnSctiesMktDdln")
	public DateFormat2Choice getRegistrationSecuritiesMarketDeadline() {
		return registrationSecuritiesMarketDeadline;
	}

	public void setRegistrationSecuritiesMarketDeadline(DateFormat2Choice registrationSecuritiesMarketDeadline) {
		this.registrationSecuritiesMarketDeadline = registrationSecuritiesMarketDeadline;
	}

	@XmlElement(name = "RegnPrtcptnDdln")
	public DateFormat2Choice getRegistrationParticipationDeadline() {
		return registrationParticipationDeadline;
	}

	public void setRegistrationParticipationDeadline(DateFormat2Choice registrationParticipationDeadline) {
		this.registrationParticipationDeadline = registrationParticipationDeadline;
	}

	@XmlElement(name = "RegnPrtcptnSTPDdln")
	public DateFormat2Choice getRegistrationParticipationSTPDeadline() {
		return registrationParticipationSTPDeadline;
	}

	public void setRegistrationParticipationSTPDeadline(DateFormat2Choice registrationParticipationSTPDeadline) {
		this.registrationParticipationSTPDeadline = registrationParticipationSTPDeadline;
	}

	@XmlElement(name = "RegnPrtcptnMktDdln")
	public DateFormat2Choice getRegistrationParticipationMarketDeadline() {
		return registrationParticipationMarketDeadline;
	}

	public void setRegistrationParticipationMarketDeadline(DateFormat2Choice registrationParticipationMarketDeadline) {
		this.registrationParticipationMarketDeadline = registrationParticipationMarketDeadline;
	}

	@XmlElement(name = "Entitlmnt")
	public Entitlement1Choice getEntitlement() {
		return entitlement;
	}

	public void setEntitlement(Entitlement1Choice entitlement) {
		this.entitlement = entitlement;
	}
}