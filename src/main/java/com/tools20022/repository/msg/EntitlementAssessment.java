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
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#EntitlementRatioOrEntitlementDescriptionRule
 * EntitlementAssessment.EntitlementRatioOrEntitlementDescriptionRule}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EntitlementAssessment", propOrder = {"securitiesBlockingDeadline", "securitiesBlockingMarketDeadline", "securitiesBlockingPeriodEndDate", "securitiesReregistrationDeadline", "securitiesReregistrationMarketDeadline",
		"securitiesRegistrationDate", "registrationBeneficiary", "recordDate", "entitlementDescription", "entitlementRatio"})
public class EntitlementAssessment {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesBlckgDdln")
	protected ISODateTime securitiesBlockingDeadline;
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
	public static final MMMessageAttribute<EntitlementAssessment, Optional<ISODateTime>> mmSecuritiesBlockingDeadline = new MMMessageAttribute<EntitlementAssessment, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment.mmObject();
			isDerived = false;
			xmlTag = "SctiesBlckgDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlockingDeadline";
			definition = "Date by which the securities should be blocked. This deadline is set by an intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(EntitlementAssessment obj) {
			return obj.getSecuritiesBlockingDeadline();
		}

		@Override
		public void setValue(EntitlementAssessment obj, Optional<ISODateTime> value) {
			obj.setSecuritiesBlockingDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesBlckgMktDdln")
	protected ISODateTime securitiesBlockingMarketDeadline;
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
	public static final MMMessageAttribute<EntitlementAssessment, Optional<ISODateTime>> mmSecuritiesBlockingMarketDeadline = new MMMessageAttribute<EntitlementAssessment, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment.mmObject();
			isDerived = false;
			xmlTag = "SctiesBlckgMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlockingMarketDeadline";
			definition = "Date by which the securities should be blocked. This deadline is set by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(EntitlementAssessment obj) {
			return obj.getSecuritiesBlockingMarketDeadline();
		}

		@Override
		public void setValue(EntitlementAssessment obj, Optional<ISODateTime> value) {
			obj.setSecuritiesBlockingMarketDeadline(value.orElse(null));
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
	public static final MMMessageAttribute<EntitlementAssessment, Optional<ISODateTime>> mmSecuritiesBlockingPeriodEndDate = new MMMessageAttribute<EntitlementAssessment, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmToDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment.mmObject();
			isDerived = false;
			xmlTag = "SctiesBlckgPrdEndDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlockingPeriodEndDate";
			definition = "Date by which the blocking period for the securities should end.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(EntitlementAssessment obj) {
			return obj.getSecuritiesBlockingPeriodEndDate();
		}

		@Override
		public void setValue(EntitlementAssessment obj, Optional<ISODateTime> value) {
			obj.setSecuritiesBlockingPeriodEndDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesRregnDdln")
	protected ISODateTime securitiesReregistrationDeadline;
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
	public static final MMMessageAttribute<EntitlementAssessment, Optional<ISODateTime>> mmSecuritiesReregistrationDeadline = new MMMessageAttribute<EntitlementAssessment, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment.mmObject();
			isDerived = false;
			xmlTag = "SctiesRregnDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesReregistrationDeadline";
			definition = "Date by which the securities have to be registered or reregistered. This deadline is specified by an intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(EntitlementAssessment obj) {
			return obj.getSecuritiesReregistrationDeadline();
		}

		@Override
		public void setValue(EntitlementAssessment obj, Optional<ISODateTime> value) {
			obj.setSecuritiesReregistrationDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesRregnMktDdln")
	protected ISODateTime securitiesReregistrationMarketDeadline;
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
	public static final MMMessageAttribute<EntitlementAssessment, Optional<ISODateTime>> mmSecuritiesReregistrationMarketDeadline = new MMMessageAttribute<EntitlementAssessment, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment.mmObject();
			isDerived = false;
			xmlTag = "SctiesRregnMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesReregistrationMarketDeadline";
			definition = "Date by which the securities have to be registered or reregistered. This deadline is set by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(EntitlementAssessment obj) {
			return obj.getSecuritiesReregistrationMarketDeadline();
		}

		@Override
		public void setValue(EntitlementAssessment obj, Optional<ISODateTime> value) {
			obj.setSecuritiesReregistrationMarketDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesRegnDt")
	protected ISODate securitiesRegistrationDate;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<EntitlementAssessment, Optional<ISODate>> mmSecuritiesRegistrationDate = new MMMessageAttribute<EntitlementAssessment, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesRegistrationDeadline.mmRegistrationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment.mmObject();
			isDerived = false;
			xmlTag = "SctiesRegnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesRegistrationDate";
			definition = "Date at which the voting positions are established (in some countries).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(EntitlementAssessment obj) {
			return obj.getSecuritiesRegistrationDate();
		}

		@Override
		public void setValue(EntitlementAssessment obj, Optional<ISODate> value) {
			obj.setSecuritiesRegistrationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "RegnBnfcry")
	protected PartyIdentification7Choice registrationBeneficiary;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<EntitlementAssessment, Optional<PartyIdentification7Choice>> mmRegistrationBeneficiary = new MMMessageAssociationEnd<EntitlementAssessment, Optional<PartyIdentification7Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment.mmObject();
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

		@Override
		public Optional<PartyIdentification7Choice> getValue(EntitlementAssessment obj) {
			return obj.getRegistrationBeneficiary();
		}

		@Override
		public void setValue(EntitlementAssessment obj, Optional<PartyIdentification7Choice> value) {
			obj.setRegistrationBeneficiary(value.orElse(null));
		}
	};
	@XmlElement(name = "RcrdDt")
	protected ISODate recordDate;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<EntitlementAssessment, Optional<ISODate>> mmRecordDate = new MMMessageAttribute<EntitlementAssessment, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmRecordDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment.mmObject();
			isDerived = false;
			xmlTag = "RcrdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDate";
			definition = "Date at which the positions are struck to note which parties will receive the entitlement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(EntitlementAssessment obj) {
			return obj.getRecordDate();
		}

		@Override
		public void setValue(EntitlementAssessment obj, Optional<ISODate> value) {
			obj.setRecordDate(value.orElse(null));
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
	public static final MMMessageAttribute<EntitlementAssessment, Optional<Max350Text>> mmEntitlementDescription = new MMMessageAttribute<EntitlementAssessment, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment.mmObject();
			isDerived = false;
			xmlTag = "EntitlmntDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementDescription";
			definition = "Specifies the calculation method of the number of votes assigned to one security. This element should be used when the entitlement calculation rule is complex.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(EntitlementAssessment obj) {
			return obj.getEntitlementDescription();
		}

		@Override
		public void setValue(EntitlementAssessment obj, Optional<Max350Text> value) {
			obj.setEntitlementDescription(value.orElse(null));
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
	 * definition} = "Number of votes assigned to one security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EntitlementAssessment, Optional<DecimalNumber>> mmEntitlementRatio = new MMMessageAttribute<EntitlementAssessment, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> MeetingEntitlement.mmEntitlementRatio;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment.mmObject();
			isDerived = false;
			xmlTag = "EntitlmntRatio";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementRatio";
			definition = "Number of votes assigned to one security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(EntitlementAssessment obj) {
			return obj.getEntitlementRatio();
		}

		@Override
		public void setValue(EntitlementAssessment obj, Optional<DecimalNumber> value) {
			obj.setEntitlementRatio(value.orElse(null));
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
	public static final MMXor EntitlementRatioOrEntitlementDescriptionRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementRatioOrEntitlementDescriptionRule";
			definition = "Either EntitlementRatio or EntitlementDescription must be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.EntitlementAssessment.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntitlementAssessment.mmEntitlementDescription, com.tools20022.repository.msg.EntitlementAssessment.mmEntitlementRatio);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntitlementAssessment.mmSecuritiesBlockingDeadline, com.tools20022.repository.msg.EntitlementAssessment.mmSecuritiesBlockingMarketDeadline,
						com.tools20022.repository.msg.EntitlementAssessment.mmSecuritiesBlockingPeriodEndDate, com.tools20022.repository.msg.EntitlementAssessment.mmSecuritiesReregistrationDeadline,
						com.tools20022.repository.msg.EntitlementAssessment.mmSecuritiesReregistrationMarketDeadline, com.tools20022.repository.msg.EntitlementAssessment.mmSecuritiesRegistrationDate,
						com.tools20022.repository.msg.EntitlementAssessment.mmRegistrationBeneficiary, com.tools20022.repository.msg.EntitlementAssessment.mmRecordDate,
						com.tools20022.repository.msg.EntitlementAssessment.mmEntitlementDescription, com.tools20022.repository.msg.EntitlementAssessment.mmEntitlementRatio);
				trace_lazy = () -> MeetingEntitlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "EntitlementAssessment";
				definition = "Specifies the parameters, such as dates, used to calculate the entitlement to vote at a general meeting.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntitlementAssessment.EntitlementRatioOrEntitlementDescriptionRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODateTime> getSecuritiesBlockingDeadline() {
		return securitiesBlockingDeadline == null ? Optional.empty() : Optional.of(securitiesBlockingDeadline);
	}

	public EntitlementAssessment setSecuritiesBlockingDeadline(ISODateTime securitiesBlockingDeadline) {
		this.securitiesBlockingDeadline = securitiesBlockingDeadline;
		return this;
	}

	public Optional<ISODateTime> getSecuritiesBlockingMarketDeadline() {
		return securitiesBlockingMarketDeadline == null ? Optional.empty() : Optional.of(securitiesBlockingMarketDeadline);
	}

	public EntitlementAssessment setSecuritiesBlockingMarketDeadline(ISODateTime securitiesBlockingMarketDeadline) {
		this.securitiesBlockingMarketDeadline = securitiesBlockingMarketDeadline;
		return this;
	}

	public Optional<ISODateTime> getSecuritiesBlockingPeriodEndDate() {
		return securitiesBlockingPeriodEndDate == null ? Optional.empty() : Optional.of(securitiesBlockingPeriodEndDate);
	}

	public EntitlementAssessment setSecuritiesBlockingPeriodEndDate(ISODateTime securitiesBlockingPeriodEndDate) {
		this.securitiesBlockingPeriodEndDate = securitiesBlockingPeriodEndDate;
		return this;
	}

	public Optional<ISODateTime> getSecuritiesReregistrationDeadline() {
		return securitiesReregistrationDeadline == null ? Optional.empty() : Optional.of(securitiesReregistrationDeadline);
	}

	public EntitlementAssessment setSecuritiesReregistrationDeadline(ISODateTime securitiesReregistrationDeadline) {
		this.securitiesReregistrationDeadline = securitiesReregistrationDeadline;
		return this;
	}

	public Optional<ISODateTime> getSecuritiesReregistrationMarketDeadline() {
		return securitiesReregistrationMarketDeadline == null ? Optional.empty() : Optional.of(securitiesReregistrationMarketDeadline);
	}

	public EntitlementAssessment setSecuritiesReregistrationMarketDeadline(ISODateTime securitiesReregistrationMarketDeadline) {
		this.securitiesReregistrationMarketDeadline = securitiesReregistrationMarketDeadline;
		return this;
	}

	public Optional<ISODate> getSecuritiesRegistrationDate() {
		return securitiesRegistrationDate == null ? Optional.empty() : Optional.of(securitiesRegistrationDate);
	}

	public EntitlementAssessment setSecuritiesRegistrationDate(ISODate securitiesRegistrationDate) {
		this.securitiesRegistrationDate = securitiesRegistrationDate;
		return this;
	}

	public Optional<PartyIdentification7Choice> getRegistrationBeneficiary() {
		return registrationBeneficiary == null ? Optional.empty() : Optional.of(registrationBeneficiary);
	}

	public EntitlementAssessment setRegistrationBeneficiary(PartyIdentification7Choice registrationBeneficiary) {
		this.registrationBeneficiary = registrationBeneficiary;
		return this;
	}

	public Optional<ISODate> getRecordDate() {
		return recordDate == null ? Optional.empty() : Optional.of(recordDate);
	}

	public EntitlementAssessment setRecordDate(ISODate recordDate) {
		this.recordDate = recordDate;
		return this;
	}

	public Optional<Max350Text> getEntitlementDescription() {
		return entitlementDescription == null ? Optional.empty() : Optional.of(entitlementDescription);
	}

	public EntitlementAssessment setEntitlementDescription(Max350Text entitlementDescription) {
		this.entitlementDescription = entitlementDescription;
		return this;
	}

	public Optional<DecimalNumber> getEntitlementRatio() {
		return entitlementRatio == null ? Optional.empty() : Optional.of(entitlementRatio);
	}

	public EntitlementAssessment setEntitlementRatio(DecimalNumber entitlementRatio) {
		this.entitlementRatio = entitlementRatio;
		return this;
	}
}