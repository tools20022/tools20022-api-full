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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.area.seev.MeetingNotificationV02;
import com.tools20022.repository.choice.DateFormat2Choice;
import com.tools20022.repository.choice.DateFormat3Choice;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.Deadline;
import com.tools20022.repository.entity.MeetingEntitlement;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Optional;
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#EntitlementRatioOrEntitlementDescriptionRule
 * EntitlementAssessment1.EntitlementRatioOrEntitlementDescriptionRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmSecuritiesBlockingDeadline
 * EntitlementAssessment1.mmSecuritiesBlockingDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmSecuritiesBlockingSTPDeadline
 * EntitlementAssessment1.mmSecuritiesBlockingSTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmSecuritiesBlockingMarketDeadline
 * EntitlementAssessment1.mmSecuritiesBlockingMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmSecuritiesBlockingPeriodEndDate
 * EntitlementAssessment1.mmSecuritiesBlockingPeriodEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmEntitlementFixingDate
 * EntitlementAssessment1.mmEntitlementFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmRegistrationSecuritiesDeadline
 * EntitlementAssessment1.mmRegistrationSecuritiesDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmRegistrationSecuritiesSTPDeadline
 * EntitlementAssessment1.mmRegistrationSecuritiesSTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmRegistrationSecuritiesMarketDeadline
 * EntitlementAssessment1.mmRegistrationSecuritiesMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmRegistrationParticipationDeadline
 * EntitlementAssessment1.mmRegistrationParticipationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmRegistrationParticipationSTPDeadline
 * EntitlementAssessment1.mmRegistrationParticipationSTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmRegistrationParticipationMarketDeadline
 * EntitlementAssessment1.mmRegistrationParticipationMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmEntitlementDescription
 * EntitlementAssessment1.mmEntitlementDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmEntitlementRatio
 * EntitlementAssessment1.mmEntitlementRatio}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02#mmEntitlementSpecification
 * MeetingNotificationV02.mmEntitlementSpecification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintEntitlementAssesment1Rule#forEntitlementAssessment1
 * ConstraintEntitlementAssesment1Rule.forEntitlementAssessment1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EntitlementAssessment1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the parameters, such as dates, used to calculate the entitlement to vote at a general meeting."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EntitlementAssessment1", propOrder = {"securitiesBlockingDeadline", "securitiesBlockingSTPDeadline", "securitiesBlockingMarketDeadline", "securitiesBlockingPeriodEndDate", "entitlementFixingDate",
		"registrationSecuritiesDeadline", "registrationSecuritiesSTPDeadline", "registrationSecuritiesMarketDeadline", "registrationParticipationDeadline", "registrationParticipationSTPDeadline", "registrationParticipationMarketDeadline",
		"entitlementDescription", "entitlementRatio"})
public class EntitlementAssessment1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesBlckgDdln")
	protected DateFormat2Choice securitiesBlockingDeadline;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1
	 * EntitlementAssessment1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesBlockingDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment1.mmObject();
			isDerived = false;
			xmlTag = "SctiesBlckgDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlockingDeadline";
			definition = "Date by which the securities should be blocked. This deadline is set by an intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "SctiesBlckgSTPDdln")
	protected DateFormat2Choice securitiesBlockingSTPDeadline;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1
	 * EntitlementAssessment1}</li>
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
	 * "Date by which the securities should be blocked. This deadline is set by the issuer. (STP mode)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesBlockingSTPDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmSTPDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment1.mmObject();
			isDerived = false;
			xmlTag = "SctiesBlckgSTPDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlockingSTPDeadline";
			definition = "Date by which the securities should be blocked. This deadline is set by the issuer. (STP mode).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "SctiesBlckgMktDdln")
	protected DateFormat2Choice securitiesBlockingMarketDeadline;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1
	 * EntitlementAssessment1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesBlockingMarketDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment1.mmObject();
			isDerived = false;
			xmlTag = "SctiesBlckgMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlockingMarketDeadline";
			definition = "Date by which the securities should be blocked. This deadline is set by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "SctiesBlckgPrdEndDt")
	protected ISODateTime securitiesBlockingPeriodEndDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1
	 * EntitlementAssessment1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesBlockingPeriodEndDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmToDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment1.mmObject();
			isDerived = false;
			xmlTag = "SctiesBlckgPrdEndDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlockingPeriodEndDate";
			definition = "Date by which the blocking period for the securities should end.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "EntitlmntFxgDt")
	protected DateFormat3Choice entitlementFixingDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1
	 * EntitlementAssessment1}</li>
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
	 * "Date at which the positions are struck to note which parties will receive the entitlement, e.g. record date, book close date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntitlementFixingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MeetingEntitlement.mmEntitlementFixingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment1.mmObject();
			isDerived = false;
			xmlTag = "EntitlmntFxgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementFixingDate";
			definition = "Date at which the positions are struck to note which parties will receive the entitlement, e.g. record date, book close date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "RegnSctiesDdln")
	protected DateFormat2Choice registrationSecuritiesDeadline;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1
	 * EntitlementAssessment1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationSecuritiesDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment1.mmObject();
			isDerived = false;
			xmlTag = "RegnSctiesDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationSecuritiesDeadline";
			definition = "Date by which the securities have to be registered. This deadline is specified by an intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "RegnSctiesSTPDdln")
	protected DateFormat2Choice registrationSecuritiesSTPDeadline;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1
	 * EntitlementAssessment1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationSecuritiesSTPDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmSTPDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment1.mmObject();
			isDerived = false;
			xmlTag = "RegnSctiesSTPDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationSecuritiesSTPDeadline";
			definition = "Date by which the securities have to be registered. This deadline is specified by an intermediary (STP mode).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "RegnSctiesMktDdln")
	protected DateFormat2Choice registrationSecuritiesMarketDeadline;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1
	 * EntitlementAssessment1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationSecuritiesMarketDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment1.mmObject();
			isDerived = false;
			xmlTag = "RegnSctiesMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationSecuritiesMarketDeadline";
			definition = "Date by which the securities have to be registered. This deadline is set by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "RegnPrtcptnDdln")
	protected DateFormat2Choice registrationParticipationDeadline;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1
	 * EntitlementAssessment1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationParticipationDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment1.mmObject();
			isDerived = false;
			xmlTag = "RegnPrtcptnDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationParticipationDeadline";
			definition = "Date by which the holder needs to register its intention to participate in the meeting process in order to be allowed to participate in the meeting event. This deadline is specified by an intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "RegnPrtcptnSTPDdln")
	protected DateFormat2Choice registrationParticipationSTPDeadline;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1
	 * EntitlementAssessment1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationParticipationSTPDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmSTPDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment1.mmObject();
			isDerived = false;
			xmlTag = "RegnPrtcptnSTPDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationParticipationSTPDeadline";
			definition = "Date by which the holder needs to register its intention to participate in the meeting process in order to be allowed to participate in the meeting event. This deadline is specified by an intermediary (STP mode).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "RegnPrtcptnMktDdln")
	protected DateFormat2Choice registrationParticipationMarketDeadline;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1
	 * EntitlementAssessment1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationParticipationMarketDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment1.mmObject();
			isDerived = false;
			xmlTag = "RegnPrtcptnMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationParticipationMarketDeadline";
			definition = "Date by which the holder needs to register its intention to participate in the meeting process in order to be allowed to participate in the meeting event. This deadline is set by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "EntitlmntDesc")
	protected Max350Text entitlementDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1
	 * EntitlementAssessment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitlmntDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitlementDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the calculation method of the number of votes assigned to one security. This element should be used when the entitlement calculation rule is complex."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntitlementDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment1.mmObject();
			isDerived = false;
			xmlTag = "EntitlmntDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementDescription";
			definition = "Specifies the calculation method of the number of votes assigned to one security. This element should be used when the entitlement calculation rule is complex.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "EntitlmntRatio")
	protected DecimalNumber entitlementRatio;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#mmEntitlementRatio
	 * MeetingEntitlement.mmEntitlementRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1
	 * EntitlementAssessment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitlmntRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitlementRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes assigned to one security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntitlementRatio = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MeetingEntitlement.mmEntitlementRatio;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment1.mmObject();
			isDerived = false;
			xmlTag = "EntitlmntRatio";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementRatio";
			definition = "Number of votes assigned to one security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Either EntitlementRatio or EntitlementDescription must be present, but
	 * not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1
	 * EntitlementAssessment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmEntitlementDescription
	 * EntitlementAssessment1.mmEntitlementDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmEntitlementRatio
	 * EntitlementAssessment1.mmEntitlementRatio}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitlementRatioOrEntitlementDescriptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either EntitlementRatio or EntitlementDescription must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor EntitlementRatioOrEntitlementDescriptionRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementRatioOrEntitlementDescriptionRule";
			definition = "Either EntitlementRatio or EntitlementDescription must be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntitlementAssessment1.mmEntitlementDescription, com.tools20022.repository.msg.EntitlementAssessment1.mmEntitlementRatio);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntitlementAssessment1.mmSecuritiesBlockingDeadline, com.tools20022.repository.msg.EntitlementAssessment1.mmSecuritiesBlockingSTPDeadline,
						com.tools20022.repository.msg.EntitlementAssessment1.mmSecuritiesBlockingMarketDeadline, com.tools20022.repository.msg.EntitlementAssessment1.mmSecuritiesBlockingPeriodEndDate,
						com.tools20022.repository.msg.EntitlementAssessment1.mmEntitlementFixingDate, com.tools20022.repository.msg.EntitlementAssessment1.mmRegistrationSecuritiesDeadline,
						com.tools20022.repository.msg.EntitlementAssessment1.mmRegistrationSecuritiesSTPDeadline, com.tools20022.repository.msg.EntitlementAssessment1.mmRegistrationSecuritiesMarketDeadline,
						com.tools20022.repository.msg.EntitlementAssessment1.mmRegistrationParticipationDeadline, com.tools20022.repository.msg.EntitlementAssessment1.mmRegistrationParticipationSTPDeadline,
						com.tools20022.repository.msg.EntitlementAssessment1.mmRegistrationParticipationMarketDeadline, com.tools20022.repository.msg.EntitlementAssessment1.mmEntitlementDescription,
						com.tools20022.repository.msg.EntitlementAssessment1.mmEntitlementRatio);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingNotificationV02.mmEntitlementSpecification);
				trace_lazy = () -> MeetingEntitlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEntitlementAssesment1Rule.forEntitlementAssessment1);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "EntitlementAssessment1";
				definition = "Specifies the parameters, such as dates, used to calculate the entitlement to vote at a general meeting.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntitlementAssessment1.EntitlementRatioOrEntitlementDescriptionRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DateFormat2Choice> getSecuritiesBlockingDeadline() {
		return securitiesBlockingDeadline == null ? Optional.empty() : Optional.of(securitiesBlockingDeadline);
	}

	public EntitlementAssessment1 setSecuritiesBlockingDeadline(DateFormat2Choice securitiesBlockingDeadline) {
		this.securitiesBlockingDeadline = securitiesBlockingDeadline;
		return this;
	}

	public Optional<DateFormat2Choice> getSecuritiesBlockingSTPDeadline() {
		return securitiesBlockingSTPDeadline == null ? Optional.empty() : Optional.of(securitiesBlockingSTPDeadline);
	}

	public EntitlementAssessment1 setSecuritiesBlockingSTPDeadline(DateFormat2Choice securitiesBlockingSTPDeadline) {
		this.securitiesBlockingSTPDeadline = securitiesBlockingSTPDeadline;
		return this;
	}

	public Optional<DateFormat2Choice> getSecuritiesBlockingMarketDeadline() {
		return securitiesBlockingMarketDeadline == null ? Optional.empty() : Optional.of(securitiesBlockingMarketDeadline);
	}

	public EntitlementAssessment1 setSecuritiesBlockingMarketDeadline(DateFormat2Choice securitiesBlockingMarketDeadline) {
		this.securitiesBlockingMarketDeadline = securitiesBlockingMarketDeadline;
		return this;
	}

	public Optional<ISODateTime> getSecuritiesBlockingPeriodEndDate() {
		return securitiesBlockingPeriodEndDate == null ? Optional.empty() : Optional.of(securitiesBlockingPeriodEndDate);
	}

	public EntitlementAssessment1 setSecuritiesBlockingPeriodEndDate(ISODateTime securitiesBlockingPeriodEndDate) {
		this.securitiesBlockingPeriodEndDate = securitiesBlockingPeriodEndDate;
		return this;
	}

	public Optional<DateFormat3Choice> getEntitlementFixingDate() {
		return entitlementFixingDate == null ? Optional.empty() : Optional.of(entitlementFixingDate);
	}

	public EntitlementAssessment1 setEntitlementFixingDate(DateFormat3Choice entitlementFixingDate) {
		this.entitlementFixingDate = entitlementFixingDate;
		return this;
	}

	public Optional<DateFormat2Choice> getRegistrationSecuritiesDeadline() {
		return registrationSecuritiesDeadline == null ? Optional.empty() : Optional.of(registrationSecuritiesDeadline);
	}

	public EntitlementAssessment1 setRegistrationSecuritiesDeadline(DateFormat2Choice registrationSecuritiesDeadline) {
		this.registrationSecuritiesDeadline = registrationSecuritiesDeadline;
		return this;
	}

	public Optional<DateFormat2Choice> getRegistrationSecuritiesSTPDeadline() {
		return registrationSecuritiesSTPDeadline == null ? Optional.empty() : Optional.of(registrationSecuritiesSTPDeadline);
	}

	public EntitlementAssessment1 setRegistrationSecuritiesSTPDeadline(DateFormat2Choice registrationSecuritiesSTPDeadline) {
		this.registrationSecuritiesSTPDeadline = registrationSecuritiesSTPDeadline;
		return this;
	}

	public Optional<DateFormat2Choice> getRegistrationSecuritiesMarketDeadline() {
		return registrationSecuritiesMarketDeadline == null ? Optional.empty() : Optional.of(registrationSecuritiesMarketDeadline);
	}

	public EntitlementAssessment1 setRegistrationSecuritiesMarketDeadline(DateFormat2Choice registrationSecuritiesMarketDeadline) {
		this.registrationSecuritiesMarketDeadline = registrationSecuritiesMarketDeadline;
		return this;
	}

	public Optional<DateFormat2Choice> getRegistrationParticipationDeadline() {
		return registrationParticipationDeadline == null ? Optional.empty() : Optional.of(registrationParticipationDeadline);
	}

	public EntitlementAssessment1 setRegistrationParticipationDeadline(DateFormat2Choice registrationParticipationDeadline) {
		this.registrationParticipationDeadline = registrationParticipationDeadline;
		return this;
	}

	public Optional<DateFormat2Choice> getRegistrationParticipationSTPDeadline() {
		return registrationParticipationSTPDeadline == null ? Optional.empty() : Optional.of(registrationParticipationSTPDeadline);
	}

	public EntitlementAssessment1 setRegistrationParticipationSTPDeadline(DateFormat2Choice registrationParticipationSTPDeadline) {
		this.registrationParticipationSTPDeadline = registrationParticipationSTPDeadline;
		return this;
	}

	public Optional<DateFormat2Choice> getRegistrationParticipationMarketDeadline() {
		return registrationParticipationMarketDeadline == null ? Optional.empty() : Optional.of(registrationParticipationMarketDeadline);
	}

	public EntitlementAssessment1 setRegistrationParticipationMarketDeadline(DateFormat2Choice registrationParticipationMarketDeadline) {
		this.registrationParticipationMarketDeadline = registrationParticipationMarketDeadline;
		return this;
	}

	public Optional<Max350Text> getEntitlementDescription() {
		return entitlementDescription == null ? Optional.empty() : Optional.of(entitlementDescription);
	}

	public EntitlementAssessment1 setEntitlementDescription(Max350Text entitlementDescription) {
		this.entitlementDescription = entitlementDescription;
		return this;
	}

	public Optional<DecimalNumber> getEntitlementRatio() {
		return entitlementRatio == null ? Optional.empty() : Optional.of(entitlementRatio);
	}

	public EntitlementAssessment1 setEntitlementRatio(DecimalNumber entitlementRatio) {
		this.entitlementRatio = entitlementRatio;
		return this;
	}
}