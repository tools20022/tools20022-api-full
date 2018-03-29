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
import com.tools20022.repository.choice.DateFormat4Choice;
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
 * Specifies corporate action dates.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmRecordDate
 * CorporateActionDate2.mmRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmEffectiveDate
 * CorporateActionDate2.mmEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmCoverExpirationDate
 * CorporateActionDate2.mmCoverExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmEqualisationDate
 * CorporateActionDate2.mmEqualisationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmMarginFixingDate
 * CorporateActionDate2.mmMarginFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmLotteryDate
 * CorporateActionDate2.mmLotteryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmProtectDate
 * CorporateActionDate2.mmProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmUnconditionalDate
 * CorporateActionDate2.mmUnconditionalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmWhollyUnconditionalDate
 * CorporateActionDate2.mmWhollyUnconditionalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmResultsPublicationDate
 * CorporateActionDate2.mmResultsPublicationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmCourtApprovalDate
 * CorporateActionDate2.mmCourtApprovalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmEarlyClosingDate
 * CorporateActionDate2.mmEarlyClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmExDividendDate
 * CorporateActionDate2.mmExDividendDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmIndexFixingDate
 * CorporateActionDate2.mmIndexFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmMaturityDate
 * CorporateActionDate2.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmTradingSuspendedDate
 * CorporateActionDate2.mmTradingSuspendedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmCertificationDeadline
 * CorporateActionDate2.mmCertificationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmRedemptionDate
 * CorporateActionDate2.mmRedemptionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmRegistrationDeadline
 * CorporateActionDate2.mmRegistrationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmProrationDate
 * CorporateActionDate2.mmProrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmDeadlineForTaxBreakdownInstruction
 * CorporateActionDate2.mmDeadlineForTaxBreakdownInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmLapsedDate
 * CorporateActionDate2.mmLapsedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmGuaranteedParticipationDate
 * CorporateActionDate2.mmGuaranteedParticipationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmElectionToCounterpartyDeadline
 * CorporateActionDate2.mmElectionToCounterpartyDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmSpecialExDate
 * CorporateActionDate2.mmSpecialExDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
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
 * "CorporateActionDate2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies corporate action dates."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionDate2", propOrder = {"recordDate", "effectiveDate", "coverExpirationDate", "equalisationDate", "marginFixingDate", "lotteryDate", "protectDate", "unconditionalDate", "whollyUnconditionalDate",
		"resultsPublicationDate", "courtApprovalDate", "earlyClosingDate", "exDividendDate", "indexFixingDate", "maturityDate", "tradingSuspendedDate", "certificationDeadline", "redemptionDate", "registrationDeadline", "prorationDate",
		"deadlineForTaxBreakdownInstruction", "lapsedDate", "guaranteedParticipationDate", "electionToCounterpartyDeadline", "specialExDate"})
public class CorporateActionDate2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RcrdDt")
	protected DateFormat4Choice recordDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRecordDate
	 * CorporateActionDeadline.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
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
	 * "Date on which positions are struck at the end of the day to note which parties will receive the relevant amount of entitlement, due to be distributed on payment date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmRecordDate = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmRecordDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "RcrdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDate";
			definition = "Date on which positions are struck at the end of the day to note which parties will receive the relevant amount of entitlement, due to be distributed on payment date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getRecordDate();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setRecordDate(value.orElse(null));
		}
	};
	@XmlElement(name = "FctvDt")
	protected DateFormat4Choice effectiveDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEffectiveDate
	 * CorporateActionEvent.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which a process is to be completed or becomes effective."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmEffectiveDate = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmEffectiveDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "FctvDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDate";
			definition = "Date on which a process is to be completed or becomes effective.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getEffectiveDate();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setEffectiveDate(value.orElse(null));
		}
	};
	@XmlElement(name = "CoverXprtnDt")
	protected DateFormat4Choice coverExpirationDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmCoverExpirationDate
	 * CorporateActionDeadline.mmCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CoverXprtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day a holder can deliver the securities that it had previously protected."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmCoverExpirationDate = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmCoverExpirationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "CoverXprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverExpirationDate";
			definition = "Last day a holder can deliver the securities that it had previously protected.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getCoverExpirationDate();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setCoverExpirationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "EqulstnDt")
	protected DateFormat4Choice equalisationDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Equalisation#mmDate
	 * Equalisation.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EqulstnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EqualisationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which all or part of any holding bought in a unit trust is subject to being treated as capital rather than income. This is normally one day after the previous distribution's ex date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmEqualisationDate = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> Equalisation.mmDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "EqulstnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualisationDate";
			definition = "Date on which all or part of any holding bought in a unit trust is subject to being treated as capital rather than income. This is normally one day after the previous distribution's ex date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getEqualisationDate();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setEqualisationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "MrgnFxgDt")
	protected DateFormat4Choice marginFixingDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmMarginFixingDate
	 * CorporateActionEvent.mmMarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnFxgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the margin rate will be determined."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmMarginFixingDate = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmMarginFixingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "MrgnFxgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginFixingDate";
			definition = "Date/time at which the margin rate will be determined.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getMarginFixingDate();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setMarginFixingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "LtryDt")
	protected DateFormat4Choice lotteryDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Lottery#mmLotteryDate
	 * Lottery.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LtryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the lottery is run and applied to the holder's positions. This is also applicable to partial calls."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmLotteryDate = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> Lottery.mmLotteryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "LtryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotteryDate";
			definition = "Date on which the lottery is run and applied to the holder's positions. This is also applicable to partial calls.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getLotteryDate();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setLotteryDate(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtctDt")
	protected DateFormat4Choice protectDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmProtectDate
	 * CorporateActionDeadline.mmProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date a holder can request to defer delivery of securities pursuant to a notice of guaranteed delivery or other required documentation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmProtectDate = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmProtectDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "PrtctDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectDate";
			definition = "Last date a holder can request to defer delivery of securities pursuant to a notice of guaranteed delivery or other required documentation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getProtectDate();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setProtectDate(value.orElse(null));
		}
	};
	@XmlElement(name = "UcondlDt")
	protected DateFormat4Choice unconditionalDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnconditionalDate
	 * CorporateActionEvent.mmUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UcondlDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnconditionalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date upon which the terms of the take-over become unconditional as to acceptances."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmUnconditionalDate = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmUnconditionalDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "UcondlDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnconditionalDate";
			definition = "Date upon which the terms of the take-over become unconditional as to acceptances.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getUnconditionalDate();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setUnconditionalDate(value.orElse(null));
		}
	};
	@XmlElement(name = "WhlyUcondlDt")
	protected DateFormat4Choice whollyUnconditionalDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmWhollyUnconditionalDate
	 * CorporateActionEvent.mmWhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhlyUcondlDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhollyUnconditionalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which all conditions, including regulatory, legal etc. pertaining to the take-over, have been met."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmWhollyUnconditionalDate = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmWhollyUnconditionalDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "WhlyUcondlDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhollyUnconditionalDate";
			definition = "Date on which all conditions, including regulatory, legal etc. pertaining to the take-over, have been met.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getWhollyUnconditionalDate();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setWhollyUnconditionalDate(value.orElse(null));
		}
	};
	@XmlElement(name = "RsltsPblctnDt")
	protected DateFormat4Choice resultsPublicationDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmResultPublicationDate
	 * CorporateActionEvent.mmResultPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsltsPblctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultsPublicationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which results are published, eg, results of an offer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmResultsPublicationDate = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmResultPublicationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "RsltsPblctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultsPublicationDate";
			definition = "Date on which results are published, eg, results of an offer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getResultsPublicationDate();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setResultsPublicationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "CrtApprvlDt")
	protected DateFormat4Choice courtApprovalDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmCourtApprovalDate
	 * ClassAction.mmCourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrtApprvlDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourtApprovalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time upon which the High Court provided approval."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmCourtApprovalDate = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> ClassAction.mmCourtApprovalDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "CrtApprvlDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CourtApprovalDate";
			definition = "Date/time upon which the High Court provided approval.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getCourtApprovalDate();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setCourtApprovalDate(value.orElse(null));
		}
	};
	@XmlElement(name = "EarlyClsgDt")
	protected DateFormat4Choice earlyClosingDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmEarlyClosingDate
	 * CorporateActionDeadline.mmEarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlyClsgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First possible early closing date of an offer if different from the expiry date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmEarlyClosingDate = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmEarlyClosingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "EarlyClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyClosingDate";
			definition = "First possible early closing date of an offer if different from the expiry date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getEarlyClosingDate();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setEarlyClosingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ExDvddDt")
	protected DateFormat4Choice exDividendDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmExDividendDate
	 * Dividend.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExDvddDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExDividendDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time as from which trading (including exchange and OTC trading) occurs on the underlying security without the benefit."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmExDividendDate = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmExDividendDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "ExDvddDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExDividendDate";
			definition = "Date/time as from which trading (including exchange and OTC trading) occurs on the underlying security without the benefit.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getExDividendDate();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setExDividendDate(value.orElse(null));
		}
	};
	@XmlElement(name = "IndxFxgDt")
	protected DateFormat4Choice indexFixingDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Index#mmIndexFixingDate
	 * Index.mmIndexFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxFxgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which an index rate will be determined."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmIndexFixingDate = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> Index.mmIndexFixingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "IndxFxgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexFixingDate";
			definition = "Date/time at which an index rate will be determined.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getIndexFixingDate();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setIndexFixingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "MtrtyDt")
	protected DateFormat4Choice maturityDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which an interest bearing financial instrument becomes due and principal is repaid by the issuer to the investor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmMaturityDate = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Date on which an interest bearing financial instrument becomes due and principal is repaid by the issuer to the investor.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getMaturityDate();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setMaturityDate(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgSspdDt")
	protected DateFormat4Choice tradingSuspendedDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmTradingSuspendedDate
	 * CorporateActionDeadline.mmTradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSspdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSuspendedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which trading of a security is suspended as the result of an event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmTradingSuspendedDate = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmTradingSuspendedDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "TradgSspdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSuspendedDate";
			definition = "Date on which trading of a security is suspended as the result of an event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getTradingSuspendedDate();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setTradingSuspendedDate(value.orElse(null));
		}
	};
	@XmlElement(name = "CertfctnDdln")
	protected DateFormat4Choice certificationDeadline;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmCertificationDeadline
	 * CorporateActionDeadline.mmCertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which the beneficial ownership of securities must be declared."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmCertificationDeadline = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmCertificationDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "CertfctnDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationDeadline";
			definition = "Deadline by which the beneficial ownership of securities must be declared.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getCertificationDeadline();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setCertificationDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "RedDt")
	protected DateFormat4Choice redemptionDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmRedemptionDate
	 * SecuritiesProceedsDefinition.mmRedemptionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the securities will be redeemed (early) for payment of principal."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmRedemptionDate = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmRedemptionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "RedDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionDate";
			definition = "Date/time at which the securities will be redeemed (early) for payment of principal.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getRedemptionDate();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setRedemptionDate(value.orElse(null));
		}
	};
	@XmlElement(name = "RegnDdln")
	protected DateFormat4Choice registrationDeadline;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRegistrationDeadline
	 * CorporateActionDeadline.mmRegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which instructions to register or registration details will be accepted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmRegistrationDeadline = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmRegistrationDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "RegnDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDeadline";
			definition = "Date on which instructions to register or registration details will be accepted.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getRegistrationDeadline();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setRegistrationDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "PrratnDt")
	protected DateFormat4Choice prorationDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmProrationDate
	 * BiddingConditions.mmProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrratnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date (and time) at which an issuer will determine the proration amount/quantity of an offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmProrationDate = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmProrationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "PrratnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProrationDate";
			definition = "Date (and time) at which an issuer will determine the proration amount/quantity of an offer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getProrationDate();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setProrationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "DdlnForTaxBrkdwnInstr")
	protected DateFormat4Choice deadlineForTaxBreakdownInstruction;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmDeadlineForTaxBreakdownInstruction
	 * CorporateActionDeadline.mmDeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DdlnForTaxBrkdwnInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeadlineForTaxBreakdownInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on until which tax breakdown instructions will be accepted."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmDeadlineForTaxBreakdownInstruction = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmDeadlineForTaxBreakdownInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "DdlnForTaxBrkdwnInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeadlineForTaxBreakdownInstruction";
			definition = "Date on until which tax breakdown instructions will be accepted.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getDeadlineForTaxBreakdownInstruction();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setDeadlineForTaxBreakdownInstruction(value.orElse(null));
		}
	};
	@XmlElement(name = "LpsdDt")
	protected DateFormat4Choice lapsedDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmLapsedDate
	 * CorporateActionEvent.mmLapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LpsdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LapsedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an event/offer is terminated or lapsed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmLapsedDate = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmLapsedDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "LpsdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LapsedDate";
			definition = "Date/time at which an event/offer is terminated or lapsed.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getLapsedDate();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setLapsedDate(value.orElse(null));
		}
	};
	@XmlElement(name = "GrntedPrtcptnDt")
	protected DateFormat4Choice guaranteedParticipationDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmGuaranteedParticipationDate
	 * CorporateActionDeadline.mmGuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrntedPrtcptnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedParticipationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date/time by which a buying counterparty to a trade can be sure that it will have the right to participate in an event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmGuaranteedParticipationDate = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmGuaranteedParticipationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "GrntedPrtcptnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedParticipationDate";
			definition = "Last date/time by which a buying counterparty to a trade can be sure that it will have the right to participate in an event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getGuaranteedParticipationDate();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setGuaranteedParticipationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ElctnToCtrPtyDdln")
	protected DateFormat4Choice electionToCounterpartyDeadline;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmElectionToCounterpartyDeadline
	 * CorporateActionDeadline.mmElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctnToCtrPtyDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionToCounterpartyDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which an entitled holder needs to advise their counterparty to a transaction of their election for a corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmElectionToCounterpartyDeadline = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmElectionToCounterpartyDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "ElctnToCtrPtyDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionToCounterpartyDeadline";
			definition = "Deadline by which an entitled holder needs to advise their counterparty to a transaction of their election for a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getElectionToCounterpartyDeadline();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setElectionToCounterpartyDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "SpclExDt")
	protected DateFormat4Choice specialExDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmSpecialExDate
	 * CorporateActionDeadline.mmSpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpclExDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time as from which 'special processing' can start to be used by participants for that event. Special processing is a means of marking a transaction, that would normally be traded ex or cum, as being traded cum or ex respectively, eg, a transaction dealt 'special' after the ex date would result in the buyer being eligible for the entitlement. This is typically used in the UK and Irish markets."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>> mmSpecialExDate = new MMMessageAttribute<CorporateActionDate2, Optional<DateFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmSpecialExDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
			isDerived = false;
			xmlTag = "SpclExDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialExDate";
			definition = "Date/time as from which 'special processing' can start to be used by participants for that event. Special processing is a means of marking a transaction, that would normally be traded ex or cum, as being traded cum or ex respectively, eg, a transaction dealt 'special' after the ex date would result in the buyer being eligible for the entitlement. This is typically used in the UK and Irish markets.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public Optional<DateFormat4Choice> getValue(CorporateActionDate2 obj) {
			return obj.getSpecialExDate();
		}

		@Override
		public void setValue(CorporateActionDate2 obj, Optional<DateFormat4Choice> value) {
			obj.setSpecialExDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate2.mmRecordDate, com.tools20022.repository.msg.CorporateActionDate2.mmEffectiveDate,
						com.tools20022.repository.msg.CorporateActionDate2.mmCoverExpirationDate, com.tools20022.repository.msg.CorporateActionDate2.mmEqualisationDate, com.tools20022.repository.msg.CorporateActionDate2.mmMarginFixingDate,
						com.tools20022.repository.msg.CorporateActionDate2.mmLotteryDate, com.tools20022.repository.msg.CorporateActionDate2.mmProtectDate, com.tools20022.repository.msg.CorporateActionDate2.mmUnconditionalDate,
						com.tools20022.repository.msg.CorporateActionDate2.mmWhollyUnconditionalDate, com.tools20022.repository.msg.CorporateActionDate2.mmResultsPublicationDate,
						com.tools20022.repository.msg.CorporateActionDate2.mmCourtApprovalDate, com.tools20022.repository.msg.CorporateActionDate2.mmEarlyClosingDate, com.tools20022.repository.msg.CorporateActionDate2.mmExDividendDate,
						com.tools20022.repository.msg.CorporateActionDate2.mmIndexFixingDate, com.tools20022.repository.msg.CorporateActionDate2.mmMaturityDate, com.tools20022.repository.msg.CorporateActionDate2.mmTradingSuspendedDate,
						com.tools20022.repository.msg.CorporateActionDate2.mmCertificationDeadline, com.tools20022.repository.msg.CorporateActionDate2.mmRedemptionDate,
						com.tools20022.repository.msg.CorporateActionDate2.mmRegistrationDeadline, com.tools20022.repository.msg.CorporateActionDate2.mmProrationDate,
						com.tools20022.repository.msg.CorporateActionDate2.mmDeadlineForTaxBreakdownInstruction, com.tools20022.repository.msg.CorporateActionDate2.mmLapsedDate,
						com.tools20022.repository.msg.CorporateActionDate2.mmGuaranteedParticipationDate, com.tools20022.repository.msg.CorporateActionDate2.mmElectionToCounterpartyDeadline,
						com.tools20022.repository.msg.CorporateActionDate2.mmSpecialExDate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDate2";
				definition = "Specifies corporate action dates.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DateFormat4Choice> getRecordDate() {
		return recordDate == null ? Optional.empty() : Optional.of(recordDate);
	}

	public CorporateActionDate2 setRecordDate(DateFormat4Choice recordDate) {
		this.recordDate = recordDate;
		return this;
	}

	public Optional<DateFormat4Choice> getEffectiveDate() {
		return effectiveDate == null ? Optional.empty() : Optional.of(effectiveDate);
	}

	public CorporateActionDate2 setEffectiveDate(DateFormat4Choice effectiveDate) {
		this.effectiveDate = effectiveDate;
		return this;
	}

	public Optional<DateFormat4Choice> getCoverExpirationDate() {
		return coverExpirationDate == null ? Optional.empty() : Optional.of(coverExpirationDate);
	}

	public CorporateActionDate2 setCoverExpirationDate(DateFormat4Choice coverExpirationDate) {
		this.coverExpirationDate = coverExpirationDate;
		return this;
	}

	public Optional<DateFormat4Choice> getEqualisationDate() {
		return equalisationDate == null ? Optional.empty() : Optional.of(equalisationDate);
	}

	public CorporateActionDate2 setEqualisationDate(DateFormat4Choice equalisationDate) {
		this.equalisationDate = equalisationDate;
		return this;
	}

	public Optional<DateFormat4Choice> getMarginFixingDate() {
		return marginFixingDate == null ? Optional.empty() : Optional.of(marginFixingDate);
	}

	public CorporateActionDate2 setMarginFixingDate(DateFormat4Choice marginFixingDate) {
		this.marginFixingDate = marginFixingDate;
		return this;
	}

	public Optional<DateFormat4Choice> getLotteryDate() {
		return lotteryDate == null ? Optional.empty() : Optional.of(lotteryDate);
	}

	public CorporateActionDate2 setLotteryDate(DateFormat4Choice lotteryDate) {
		this.lotteryDate = lotteryDate;
		return this;
	}

	public Optional<DateFormat4Choice> getProtectDate() {
		return protectDate == null ? Optional.empty() : Optional.of(protectDate);
	}

	public CorporateActionDate2 setProtectDate(DateFormat4Choice protectDate) {
		this.protectDate = protectDate;
		return this;
	}

	public Optional<DateFormat4Choice> getUnconditionalDate() {
		return unconditionalDate == null ? Optional.empty() : Optional.of(unconditionalDate);
	}

	public CorporateActionDate2 setUnconditionalDate(DateFormat4Choice unconditionalDate) {
		this.unconditionalDate = unconditionalDate;
		return this;
	}

	public Optional<DateFormat4Choice> getWhollyUnconditionalDate() {
		return whollyUnconditionalDate == null ? Optional.empty() : Optional.of(whollyUnconditionalDate);
	}

	public CorporateActionDate2 setWhollyUnconditionalDate(DateFormat4Choice whollyUnconditionalDate) {
		this.whollyUnconditionalDate = whollyUnconditionalDate;
		return this;
	}

	public Optional<DateFormat4Choice> getResultsPublicationDate() {
		return resultsPublicationDate == null ? Optional.empty() : Optional.of(resultsPublicationDate);
	}

	public CorporateActionDate2 setResultsPublicationDate(DateFormat4Choice resultsPublicationDate) {
		this.resultsPublicationDate = resultsPublicationDate;
		return this;
	}

	public Optional<DateFormat4Choice> getCourtApprovalDate() {
		return courtApprovalDate == null ? Optional.empty() : Optional.of(courtApprovalDate);
	}

	public CorporateActionDate2 setCourtApprovalDate(DateFormat4Choice courtApprovalDate) {
		this.courtApprovalDate = courtApprovalDate;
		return this;
	}

	public Optional<DateFormat4Choice> getEarlyClosingDate() {
		return earlyClosingDate == null ? Optional.empty() : Optional.of(earlyClosingDate);
	}

	public CorporateActionDate2 setEarlyClosingDate(DateFormat4Choice earlyClosingDate) {
		this.earlyClosingDate = earlyClosingDate;
		return this;
	}

	public Optional<DateFormat4Choice> getExDividendDate() {
		return exDividendDate == null ? Optional.empty() : Optional.of(exDividendDate);
	}

	public CorporateActionDate2 setExDividendDate(DateFormat4Choice exDividendDate) {
		this.exDividendDate = exDividendDate;
		return this;
	}

	public Optional<DateFormat4Choice> getIndexFixingDate() {
		return indexFixingDate == null ? Optional.empty() : Optional.of(indexFixingDate);
	}

	public CorporateActionDate2 setIndexFixingDate(DateFormat4Choice indexFixingDate) {
		this.indexFixingDate = indexFixingDate;
		return this;
	}

	public Optional<DateFormat4Choice> getMaturityDate() {
		return maturityDate == null ? Optional.empty() : Optional.of(maturityDate);
	}

	public CorporateActionDate2 setMaturityDate(DateFormat4Choice maturityDate) {
		this.maturityDate = maturityDate;
		return this;
	}

	public Optional<DateFormat4Choice> getTradingSuspendedDate() {
		return tradingSuspendedDate == null ? Optional.empty() : Optional.of(tradingSuspendedDate);
	}

	public CorporateActionDate2 setTradingSuspendedDate(DateFormat4Choice tradingSuspendedDate) {
		this.tradingSuspendedDate = tradingSuspendedDate;
		return this;
	}

	public Optional<DateFormat4Choice> getCertificationDeadline() {
		return certificationDeadline == null ? Optional.empty() : Optional.of(certificationDeadline);
	}

	public CorporateActionDate2 setCertificationDeadline(DateFormat4Choice certificationDeadline) {
		this.certificationDeadline = certificationDeadline;
		return this;
	}

	public Optional<DateFormat4Choice> getRedemptionDate() {
		return redemptionDate == null ? Optional.empty() : Optional.of(redemptionDate);
	}

	public CorporateActionDate2 setRedemptionDate(DateFormat4Choice redemptionDate) {
		this.redemptionDate = redemptionDate;
		return this;
	}

	public Optional<DateFormat4Choice> getRegistrationDeadline() {
		return registrationDeadline == null ? Optional.empty() : Optional.of(registrationDeadline);
	}

	public CorporateActionDate2 setRegistrationDeadline(DateFormat4Choice registrationDeadline) {
		this.registrationDeadline = registrationDeadline;
		return this;
	}

	public Optional<DateFormat4Choice> getProrationDate() {
		return prorationDate == null ? Optional.empty() : Optional.of(prorationDate);
	}

	public CorporateActionDate2 setProrationDate(DateFormat4Choice prorationDate) {
		this.prorationDate = prorationDate;
		return this;
	}

	public Optional<DateFormat4Choice> getDeadlineForTaxBreakdownInstruction() {
		return deadlineForTaxBreakdownInstruction == null ? Optional.empty() : Optional.of(deadlineForTaxBreakdownInstruction);
	}

	public CorporateActionDate2 setDeadlineForTaxBreakdownInstruction(DateFormat4Choice deadlineForTaxBreakdownInstruction) {
		this.deadlineForTaxBreakdownInstruction = deadlineForTaxBreakdownInstruction;
		return this;
	}

	public Optional<DateFormat4Choice> getLapsedDate() {
		return lapsedDate == null ? Optional.empty() : Optional.of(lapsedDate);
	}

	public CorporateActionDate2 setLapsedDate(DateFormat4Choice lapsedDate) {
		this.lapsedDate = lapsedDate;
		return this;
	}

	public Optional<DateFormat4Choice> getGuaranteedParticipationDate() {
		return guaranteedParticipationDate == null ? Optional.empty() : Optional.of(guaranteedParticipationDate);
	}

	public CorporateActionDate2 setGuaranteedParticipationDate(DateFormat4Choice guaranteedParticipationDate) {
		this.guaranteedParticipationDate = guaranteedParticipationDate;
		return this;
	}

	public Optional<DateFormat4Choice> getElectionToCounterpartyDeadline() {
		return electionToCounterpartyDeadline == null ? Optional.empty() : Optional.of(electionToCounterpartyDeadline);
	}

	public CorporateActionDate2 setElectionToCounterpartyDeadline(DateFormat4Choice electionToCounterpartyDeadline) {
		this.electionToCounterpartyDeadline = electionToCounterpartyDeadline;
		return this;
	}

	public Optional<DateFormat4Choice> getSpecialExDate() {
		return specialExDate == null ? Optional.empty() : Optional.of(specialExDate);
	}

	public CorporateActionDate2 setSpecialExDate(DateFormat4Choice specialExDate) {
		this.specialExDate = specialExDate;
		return this;
	}
}