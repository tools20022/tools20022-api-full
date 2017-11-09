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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.PartyIdentification7Choice;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the parameters, such as dates, used to calculate the entitlement to
 * vote at a general meeting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmEntitlementRatioOrEntitlementDescriptionRule
 * EntitlementAssessment.mmEntitlementRatioOrEntitlementDescriptionRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmSecuritiesBlockingDeadline
 * EntitlementAssessment.mmSecuritiesBlockingDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmSecuritiesBlockingMarketDeadline
 * EntitlementAssessment.mmSecuritiesBlockingMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmSecuritiesBlockingPeriodEndDate
 * EntitlementAssessment.mmSecuritiesBlockingPeriodEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmSecuritiesReregistrationDeadline
 * EntitlementAssessment.mmSecuritiesReregistrationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmSecuritiesReregistrationMarketDeadline
 * EntitlementAssessment.mmSecuritiesReregistrationMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmSecuritiesRegistrationDate
 * EntitlementAssessment.mmSecuritiesRegistrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmRegistrationBeneficiary
 * EntitlementAssessment.mmRegistrationBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmRecordDate
 * EntitlementAssessment.mmRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmEntitlementDescription
 * EntitlementAssessment.mmEntitlementDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmEntitlementRatio
 * EntitlementAssessment.mmEntitlementRatio}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MeetingEntitlement
 * MeetingEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EntitlementAssessment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the parameters, such as dates, used to calculate the entitlement to vote at a general meeting."
 * </li>
 * </ul>
 */
public class EntitlementAssessment {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime securitiesBlockingDeadline;
	/**
	 * Date by which the securities should be blocked. This deadline is set by
	 * an intermediary.
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
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
	 * Deadline.mmIntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment
	 * EntitlementAssessment}</li>
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
			componentContext_lazy = () -> EntitlementAssessment.mmObject();
			isDerived = false;
			xmlTag = "SctiesBlckgDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlockingDeadline";
			definition = "Date by which the securities should be blocked. This deadline is set by an intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime securitiesBlockingMarketDeadline;
	/**
	 * Date by which the securities should be blocked. This deadline is set by
	 * the issuer.
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
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment
	 * EntitlementAssessment}</li>
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
			componentContext_lazy = () -> EntitlementAssessment.mmObject();
			isDerived = false;
			xmlTag = "SctiesBlckgMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlockingMarketDeadline";
			definition = "Date by which the securities should be blocked. This deadline is set by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment
	 * EntitlementAssessment}</li>
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
			componentContext_lazy = () -> EntitlementAssessment.mmObject();
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
	protected ISODateTime securitiesReregistrationDeadline;
	/**
	 * Date by which the securities have to be registered or reregistered. This
	 * deadline is specified by an intermediary.
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
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
	 * Deadline.mmIntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment
	 * EntitlementAssessment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesRregnDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesReregistrationDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the securities have to be registered or reregistered. This deadline is specified by an intermediary."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesReregistrationDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> EntitlementAssessment.mmObject();
			isDerived = false;
			xmlTag = "SctiesRregnDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesReregistrationDeadline";
			definition = "Date by which the securities have to be registered or reregistered. This deadline is specified by an intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime securitiesReregistrationMarketDeadline;
	/**
	 * Date by which the securities have to be registered or reregistered. This
	 * deadline is set by the issuer.
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
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment
	 * EntitlementAssessment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesRregnMktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesReregistrationMarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the securities have to be registered or reregistered. This deadline is set by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesReregistrationMarketDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> EntitlementAssessment.mmObject();
			isDerived = false;
			xmlTag = "SctiesRregnMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesReregistrationMarketDeadline";
			definition = "Date by which the securities have to be registered or reregistered. This deadline is set by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODate securitiesRegistrationDate;
	/**
	 * Date at which the voting positions are established (in some countries).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRegistrationDeadline#mmRegistrationDate
	 * SecuritiesRegistrationDeadline.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment
	 * EntitlementAssessment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesRegnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesRegistrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the voting positions are established (in some countries)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesRegistrationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesRegistrationDeadline.mmRegistrationDate;
			componentContext_lazy = () -> EntitlementAssessment.mmObject();
			isDerived = false;
			xmlTag = "SctiesRegnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesRegistrationDate";
			definition = "Date at which the voting positions are established (in some countries).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected PartyIdentification7Choice registrationBeneficiary;
	/**
	 * Party in which name the securities are registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification7Choice
	 * PartyIdentification7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment
	 * EntitlementAssessment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnBnfcry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationBeneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party in which name the securities are registered."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRegistrationBeneficiary = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> EntitlementAssessment.mmObject();
			isDerived = false;
			xmlTag = "RegnBnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationBeneficiary";
			definition = "Party in which name the securities are registered.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification7Choice.mmObject();
		}
	};
	protected ISODate recordDate;
	/**
	 * Date at which the positions are struck to note which parties will receive
	 * the entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRecordDate
	 * CorporateActionDeadline.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment
	 * EntitlementAssessment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcrdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the positions are struck to note which parties will receive the entitlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRecordDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmRecordDate;
			componentContext_lazy = () -> EntitlementAssessment.mmObject();
			isDerived = false;
			xmlTag = "RcrdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDate";
			definition = "Date at which the positions are struck to note which parties will receive the entitlement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max350Text entitlementDescription;
	/**
	 * Specifies the calculation method of the number of votes assigned to one
	 * security. This element should be used when the entitlement calculation
	 * rule is complex.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment
	 * EntitlementAssessment}</li>
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
			componentContext_lazy = () -> EntitlementAssessment.mmObject();
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
	protected DecimalNumber entitlementRatio;
	/**
	 * Number of votes assigned to one security.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment
	 * EntitlementAssessment}</li>
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
	 * definition} = "Number of votes assigned to one security. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntitlementRatio = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MeetingEntitlement.mmEntitlementRatio;
			componentContext_lazy = () -> EntitlementAssessment.mmObject();
			isDerived = false;
			xmlTag = "EntitlmntRatio";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementRatio";
			definition = "Number of votes assigned to one security. ";
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
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment
	 * EntitlementAssessment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmEntitlementDescription
	 * EntitlementAssessment.mmEntitlementDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmEntitlementRatio
	 * EntitlementAssessment.mmEntitlementRatio}</li>
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
	public static final MMXor mmEntitlementRatioOrEntitlementDescriptionRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementRatioOrEntitlementDescriptionRule";
			definition = "Either EntitlementRatio or EntitlementDescription must be present, but not both.";
			messageComponent_lazy = () -> EntitlementAssessment.mmObject();
			impactedElements_lazy = () -> Arrays.asList(EntitlementAssessment.mmEntitlementDescription, EntitlementAssessment.mmEntitlementRatio);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(EntitlementAssessment.mmSecuritiesBlockingDeadline, EntitlementAssessment.mmSecuritiesBlockingMarketDeadline, EntitlementAssessment.mmSecuritiesBlockingPeriodEndDate,
						EntitlementAssessment.mmSecuritiesReregistrationDeadline, EntitlementAssessment.mmSecuritiesReregistrationMarketDeadline, EntitlementAssessment.mmSecuritiesRegistrationDate,
						EntitlementAssessment.mmRegistrationBeneficiary, EntitlementAssessment.mmRecordDate, EntitlementAssessment.mmEntitlementDescription, EntitlementAssessment.mmEntitlementRatio);
				trace_lazy = () -> MeetingEntitlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "EntitlementAssessment";
				definition = "Specifies the parameters, such as dates, used to calculate the entitlement to vote at a general meeting.";
				xors_lazy = () -> Arrays.asList(EntitlementAssessment.mmEntitlementRatioOrEntitlementDescriptionRule);
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getSecuritiesBlockingDeadline() {
		return securitiesBlockingDeadline;
	}

	public void setSecuritiesBlockingDeadline(ISODateTime securitiesBlockingDeadline) {
		this.securitiesBlockingDeadline = securitiesBlockingDeadline;
	}

	public ISODateTime getSecuritiesBlockingMarketDeadline() {
		return securitiesBlockingMarketDeadline;
	}

	public void setSecuritiesBlockingMarketDeadline(ISODateTime securitiesBlockingMarketDeadline) {
		this.securitiesBlockingMarketDeadline = securitiesBlockingMarketDeadline;
	}

	public ISODateTime getSecuritiesBlockingPeriodEndDate() {
		return securitiesBlockingPeriodEndDate;
	}

	public void setSecuritiesBlockingPeriodEndDate(ISODateTime securitiesBlockingPeriodEndDate) {
		this.securitiesBlockingPeriodEndDate = securitiesBlockingPeriodEndDate;
	}

	public ISODateTime getSecuritiesReregistrationDeadline() {
		return securitiesReregistrationDeadline;
	}

	public void setSecuritiesReregistrationDeadline(ISODateTime securitiesReregistrationDeadline) {
		this.securitiesReregistrationDeadline = securitiesReregistrationDeadline;
	}

	public ISODateTime getSecuritiesReregistrationMarketDeadline() {
		return securitiesReregistrationMarketDeadline;
	}

	public void setSecuritiesReregistrationMarketDeadline(ISODateTime securitiesReregistrationMarketDeadline) {
		this.securitiesReregistrationMarketDeadline = securitiesReregistrationMarketDeadline;
	}

	public ISODate getSecuritiesRegistrationDate() {
		return securitiesRegistrationDate;
	}

	public void setSecuritiesRegistrationDate(ISODate securitiesRegistrationDate) {
		this.securitiesRegistrationDate = securitiesRegistrationDate;
	}

	public PartyIdentification7Choice getRegistrationBeneficiary() {
		return registrationBeneficiary;
	}

	public void setRegistrationBeneficiary(PartyIdentification7Choice registrationBeneficiary) {
		this.registrationBeneficiary = registrationBeneficiary;
	}

	public ISODate getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(ISODate recordDate) {
		this.recordDate = recordDate;
	}

	public Max350Text getEntitlementDescription() {
		return entitlementDescription;
	}

	public void setEntitlementDescription(Max350Text entitlementDescription) {
		this.entitlementDescription = entitlementDescription;
	}

	public DecimalNumber getEntitlementRatio() {
		return entitlementRatio;
	}

	public void setEntitlementRatio(DecimalNumber entitlementRatio) {
		this.entitlementRatio = entitlementRatio;
	}
}