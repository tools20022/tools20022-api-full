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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CorporateActionReferenceDateCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reference date of corporate action, in coded form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#AnnouncementDate
 * CorporateActionReferenceDateCode.AnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#AvailableDate
 * CorporateActionReferenceDateCode.AvailableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#CertificationDeadline
 * CorporateActionReferenceDateCode.CertificationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#ConsentExpirationDate
 * CorporateActionReferenceDateCode.ConsentExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#CourtApprovalDate
 * CorporateActionReferenceDateCode.CourtApprovalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#ConsentRecordDate
 * CorporateActionReferenceDateCode.ConsentRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#CoverExpirationDate
 * CorporateActionReferenceDateCode.CoverExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#DividendRankingDate
 * CorporateActionReferenceDateCode.DividendRankingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#EarliestPaymentDate
 * CorporateActionReferenceDateCode.EarliestPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#ElectionToCounterpartyDeadline
 * CorporateActionReferenceDateCode.ElectionToCounterpartyDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#EffectiveDate
 * CorporateActionReferenceDateCode.EffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#EqualisationDate
 * CorporateActionReferenceDateCode.EqualisationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#ExpiryDate
 * CorporateActionReferenceDateCode.ExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#FirstBusinessDayOfMonth
 * CorporateActionReferenceDateCode.FirstBusinessDayOfMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#FirstCalendarDayOfMonth
 * CorporateActionReferenceDateCode.FirstCalendarDayOfMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#FurtherDetailedAnnouncementDate
 * CorporateActionReferenceDateCode.FurtherDetailedAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#CurrencyExchangeDate
 * CorporateActionReferenceDateCode.CurrencyExchangeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#GuaranteedParticipationDate
 * CorporateActionReferenceDateCode.GuaranteedParticipationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#IndexFixingDate
 * CorporateActionReferenceDateCode.IndexFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#InstructedDate
 * CorporateActionReferenceDateCode.InstructedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#LastBusinessDayOfMonth
 * CorporateActionReferenceDateCode.LastBusinessDayOfMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#LastCalendarDayOfMonth
 * CorporateActionReferenceDateCode.LastCalendarDayOfMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#LotteryDate
 * CorporateActionReferenceDateCode.LotteryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#MaturityDate
 * CorporateActionReferenceDateCode.MaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#MeetingDate
 * CorporateActionReferenceDateCode.MeetingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#SecondMeetingDate
 * CorporateActionReferenceDateCode.SecondMeetingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#ThirdMeetingDate
 * CorporateActionReferenceDateCode.ThirdMeetingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#MarginFixingDate
 * CorporateActionReferenceDateCode.MarginFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#MarketDeadline
 * CorporateActionReferenceDateCode.MarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#PaymentDate
 * CorporateActionReferenceDateCode.PaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#ProtectDate
 * CorporateActionReferenceDateCode.ProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#PariPassuDate
 * CorporateActionReferenceDateCode.PariPassuDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#ProrationDate
 * CorporateActionReferenceDateCode.ProrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#ResponseDeadline
 * CorporateActionReferenceDateCode.ResponseDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#RecordDate
 * CorporateActionReferenceDateCode.RecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#RegistrationDeadline
 * CorporateActionReferenceDateCode.RegistrationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#ResultsPublicationDate
 * CorporateActionReferenceDateCode.ResultsPublicationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#SplitDeadline
 * CorporateActionReferenceDateCode.SplitDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#SubscriptionCostDebitDate
 * CorporateActionReferenceDateCode.SubscriptionCostDebitDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#SpecialExDate
 * CorporateActionReferenceDateCode.SpecialExDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#DeadlineForTaxBreakdownInstructions
 * CorporateActionReferenceDateCode.DeadlineForTaxBreakdownInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#TradeDateTime
 * CorporateActionReferenceDateCode.TradeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#TradingSuspendedDate
 * CorporateActionReferenceDateCode.TradingSuspendedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#UnconditionalDate
 * CorporateActionReferenceDateCode.UnconditionalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#ValueDate
 * CorporateActionReferenceDateCode.ValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#WhollyUnconditionalDate
 * CorporateActionReferenceDateCode.WhollyUnconditionalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#ExDividendDate
 * CorporateActionReferenceDateCode.ExDividendDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode#EarlyResponseDeadline
 * CorporateActionReferenceDateCode.EarlyResponseDeadline}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionDeadline1Code
 * CorporateActionDeadline1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ANOU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionReferenceDateCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reference date of corporate action, in coded form."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionReferenceDateCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date on which the issuer announced that a corporate action event will
	 * occur.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANOU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the issuer announced that a corporate action event will occur."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode AnnouncementDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AnnouncementDate";
			definition = "Date on which the issuer announced that a corporate action event will occur.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "ANOU";
		}
	};
	/**
	 * Date on which securities become available for trading, for example first
	 * dealing date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AVAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which securities become available for trading, for example first dealing date."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode AvailableDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AvailableDate";
			definition = "Date on which securities become available for trading, for example first dealing date.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "AVAL";
		}
	};
	/**
	 * Deadline by which the beneficial ownership of securities must be
	 * declared.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CERT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which the beneficial ownership of securities must be declared."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode CertificationDeadline = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificationDeadline";
			definition = "Deadline by which the beneficial ownership of securities must be declared.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "CERT";
		}
	};
	/**
	 * Last date on which a holder can consent to the changes sought by the
	 * corporation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CEXD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date on which a holder can consent to the changes sought by the corporation."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode ConsentExpirationDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConsentExpirationDate";
			definition = "Last date on which a holder can consent to the changes sought by the corporation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "CEXD";
		}
	};
	/**
	 * Date upon which the court provided approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourtApprovalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date upon which the court provided approval."</li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode CourtApprovalDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CourtApprovalDate";
			definition = "Date upon which the court provided approval.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "COAP";
		}
	};
	/**
	 * Date used by the offeror to determine the beneficiary eligible to
	 * participate in a consent based on the registered owner of the securities,
	 * for example, beneficial owner of consent record. Consent record date
	 * qualifier is used to indicate that a record date only applies to a
	 * certain part of the offer, not the entire offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentRecordDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date used by the offeror to determine the beneficiary eligible to participate in a consent based on the registered owner of the securities, for example, beneficial owner of consent record. Consent record date qualifier is used to indicate that a record date only applies to a certain part of the offer, not the entire offer."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode ConsentRecordDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConsentRecordDate";
			definition = "Date used by the offeror to determine the beneficiary eligible to participate in a consent based on the registered owner of the securities, for example, beneficial owner of consent record. Consent record date qualifier is used to indicate that a record date only applies to a certain part of the offer, not the entire offer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "CORD";
		}
	};
	/**
	 * Last day a holder can deliver the securities that it had elected on
	 * and/or previously protected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CVPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day a holder can deliver the securities that it had elected on and/or previously protected."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode CoverExpirationDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CoverExpirationDate";
			definition = "Last day a holder can deliver the securities that it had elected on and/or previously protected.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "CVPR";
		}
	};
	/**
	 * Date on which a security will be entitled to a dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendRankingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which a security will be entitled to a dividend."</li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode DividendRankingDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendRankingDate";
			definition = "Date on which a security will be entitled to a dividend.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "DIVR";
		}
	};
	/**
	 * Date on which a payment can be made, for example, if payment date is a
	 * non-business day or to indicate the first payment date of an offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EARL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which a payment can be made, for example, if payment date is a non-business day or to indicate the first payment date of an offer."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode EarliestPaymentDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EarliestPaymentDate";
			definition = "Date on which a payment can be made, for example, if payment date is a non-business day or to indicate the first payment date of an offer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "EARL";
		}
	};
	/**
	 * Deadline by which an entitled holder needs to advise their counterparty
	 * to a transaction of their election for a corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionToCounterpartyDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which an entitled holder needs to advise their counterparty to a transaction of their election for a corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode ElectionToCounterpartyDeadline = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ElectionToCounterpartyDeadline";
			definition = "Deadline by which an entitled holder needs to advise their counterparty to a transaction of their election for a corporate action event.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "ECPD";
		}
	};
	/**
	 * Date on which a process is to be completed or becomes effective.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EFFD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which a process is to be completed or becomes effective."</li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode EffectiveDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectiveDate";
			definition = "Date on which a process is to be completed or becomes effective.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "EFFD";
		}
	};
	/**
	 * Date on which all or part of any holding bought in a unit trust is
	 * subject to being treated as capital rather than income. This is normally
	 * one day after the previous distribution's ex date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EQUL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EqualisationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which all or part of any holding bought in a unit trust is subject to being treated as capital rather than income. This is normally one day after the previous distribution's ex date."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode EqualisationDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EqualisationDate";
			definition = "Date on which all or part of any holding bought in a unit trust is subject to being treated as capital rather than income. This is normally one day after the previous distribution's ex date.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "EQUL";
		}
	};
	/**
	 * Date on which an order expires or on which a privilege or offer
	 * terminates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which an order expires or on which a privilege or offer terminates."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode ExpiryDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date on which an order expires or on which a privilege or offer terminates.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "EXPI";
		}
	};
	/**
	 * First day of the month that is a working day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FBDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstBusinessDayOfMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First day of the month that is a working day."</li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode FirstBusinessDayOfMonth = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstBusinessDayOfMonth";
			definition = "First day of the month that is a working day.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "FBDM";
		}
	};
	/**
	 * First calendar day of the month.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstCalendarDayOfMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First calendar day of the month."</li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode FirstCalendarDayOfMonth = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstCalendarDayOfMonth";
			definition = "First calendar day of the month.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "FCDM";
		}
	};
	/**
	 * Date on which additional information on the event will be announced, for
	 * example, exchange ratio announcement date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FDAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FurtherDetailedAnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which additional information on the event will be announced, for example, exchange ratio announcement date."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode FurtherDetailedAnnouncementDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FurtherDetailedAnnouncementDate";
			definition = "Date on which additional information on the event will be announced, for example, exchange ratio announcement date.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "FDAT";
		}
	};
	/**
	 * Date on which a foreign exchange rate will be determined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FXDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which a foreign exchange rate will be determined."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode CurrencyExchangeDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeDate";
			definition = "Date on which a foreign exchange rate will be determined.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "FXDT";
		}
	};
	/**
	 * Last date/time by which a buying counterparty to a trade can be sure that
	 * it will have the right to participate in an event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GUPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedParticipationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date/time by which a buying counterparty to a trade can be sure that it will have the right to participate in an event."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode GuaranteedParticipationDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GuaranteedParticipationDate";
			definition = "Last date/time by which a buying counterparty to a trade can be sure that it will have the right to participate in an event.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "GUPA";
		}
	};
	/**
	 * Date/time at which an index rate will be determined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IFIX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which an index rate will be determined."</li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode IndexFixingDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndexFixingDate";
			definition = "Date/time at which an index rate will be determined.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "IFIX";
		}
	};
	/**
	 * Date on which instruction was sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which instruction was sent."</li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode InstructedDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructedDate";
			definition = "Date on which instruction was sent.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "INST";
		}
	};
	/**
	 * Last day of the month that is a working day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LBDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastBusinessDayOfMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Last day of the month that is a working day."</li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode LastBusinessDayOfMonth = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LastBusinessDayOfMonth";
			definition = "Last day of the month that is a working day.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "LBDM";
		}
	};
	/**
	 * Last calendar day of the month.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LCDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastCalendarDayOfMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Last calendar day of the month."</li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode LastCalendarDayOfMonth = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LastCalendarDayOfMonth";
			definition = "Last calendar day of the month.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "LCDM";
		}
	};
	/**
	 * Date on which the lottery is run and applied to the holder's positions.
	 * This is also applicable to partial calls.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the lottery is run and applied to the holder's positions. This is also applicable to partial calls."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode LotteryDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotteryDate";
			definition = "Date on which the lottery is run and applied to the holder's positions. This is also applicable to partial calls.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "LOTO";
		}
	};
	/**
	 * Date upon which interest bearing security becomes due and principal is
	 * paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MATU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date upon which interest bearing security becomes due and principal is paid."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode MaturityDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaturityDate";
			definition = "Date upon which interest bearing security becomes due and principal is paid.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "MATU";
		}
	};
	/**
	 * Date on which the bondholders' or shareholders' meeting will take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MEET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the bondholders' or shareholders' meeting will take place."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode MeetingDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingDate";
			definition = "Date on which the bondholders' or shareholders' meeting will take place.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "MEET";
		}
	};
	/**
	 * Date on which the company's general meeting is scheduled, second session
	 * if applicable, for example, Italy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MET2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondMeetingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the company's general meeting is scheduled, second session if applicable, for example, Italy."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode SecondMeetingDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecondMeetingDate";
			definition = "Date on which the company's general meeting is scheduled, second session if applicable, for example, Italy.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "MET2";
		}
	};
	/**
	 * Date on which the company's general meeting is scheduled, third session
	 * if applicable, for example, Italy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MET3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdMeetingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the company's general meeting is scheduled, third session if applicable, for example, Italy."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode ThirdMeetingDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ThirdMeetingDate";
			definition = "Date on which the company's general meeting is scheduled, third session if applicable, for example, Italy.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "MET3";
		}
	};
	/**
	 * Date/time at which the margin rate will be determined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MFIX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the margin rate will be determined."</li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode MarginFixingDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginFixingDate";
			definition = "Date/time at which the margin rate will be determined.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "MFIX";
		}
	};
	/**
	 * Issuer or issuer's agent deadline to respond, with an election
	 * instruction, to an outstanding offer or privilege.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MKDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issuer or issuer's agent deadline to respond, with an election instruction, to an outstanding offer or privilege."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode MarketDeadline = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketDeadline";
			definition = "Issuer or issuer's agent deadline to respond, with an election instruction, to an outstanding offer or privilege.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "MKDT";
		}
	};
	/**
	 * Date on which the movement is due to take place (cash and/or securities).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAYD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the movement is due to take place (cash and/or securities)."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode PaymentDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentDate";
			definition = "Date on which the movement is due to take place (cash and/or securities).";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "PAYD";
		}
	};
	/**
	 * Last date a holder can request to defer delivery of securities pursuant
	 * to a notice of guaranteed delivery or other required documentation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PODT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date a holder can request to defer delivery of securities pursuant to a notice of guaranteed delivery or other required documentation."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode ProtectDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProtectDate";
			definition = "Last date a holder can request to defer delivery of securities pursuant to a notice of guaranteed delivery or other required documentation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "PODT";
		}
	};
	/**
	 * Date on which security will assimilate, become fungible, or have the same
	 * rights to dividends as the parent issue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PPDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassuDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which security will assimilate, become fungible, or have the same rights to dividends as the parent issue."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode PariPassuDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PariPassuDate";
			definition = "Date on which security will assimilate, become fungible, or have the same rights to dividends as the parent issue.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "PPDT";
		}
	};
	/**
	 * Date at which an issuer will determine the proration amount/quantity of
	 * an offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which an issuer will determine the proration amount/quantity of an offer."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode ProrationDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProrationDate";
			definition = "Date at which an issuer will determine the proration amount/quantity of an offer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "PROD";
		}
	};
	/**
	 * Date on which the account servicer has set as the deadline to respond,
	 * with instructions, to an outstanding event. This time is dependent on the
	 * reference time zone of the account servicer as specified in a Service
	 * Level Agreement (SLA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RDDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account servicer has set as the deadline to respond, with instructions, to an outstanding event. This time is dependent on the reference time zone of the account servicer as specified in a Service Level Agreement (SLA)."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode ResponseDeadline = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResponseDeadline";
			definition = "Date on which the account servicer has set as the deadline to respond, with instructions, to an outstanding event. This time is dependent on the reference time zone of the account servicer as specified in a Service Level Agreement (SLA).";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "RDDT";
		}
	};
	/**
	 * Date on which positions are struck at the end of the day to note which
	 * parties will receive the relevant amount of entitlement, due to be
	 * distributed on payment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RDTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which positions are struck at the end of the day to note which parties will receive the relevant amount of entitlement, due to be distributed on payment date."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode RecordDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RecordDate";
			definition = "Date on which positions are struck at the end of the day to note which parties will receive the relevant amount of entitlement, due to be distributed on payment date.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "RDTE";
		}
	};
	/**
	 * Date on which instructions to register or registration details will be
	 * accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which instructions to register or registration details will be accepted."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode RegistrationDeadline = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationDeadline";
			definition = "Date on which instructions to register or registration details will be accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "REGI";
		}
	};
	/**
	 * Date on which results are published, for example, results of an offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RESU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultsPublicationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which results are published, for example, results of an offer."</li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode ResultsPublicationDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResultsPublicationDate";
			definition = "Date on which results are published, for example, results of an offer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "RESU";
		}
	};
	/**
	 * Deadline by which instructions must be received to split securities, for
	 * example, of physical certificates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which instructions must be received to split securities, for example, of physical certificates."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode SplitDeadline = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SplitDeadline";
			definition = "Deadline by which instructions must be received to split securities, for example, of physical certificates.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "SPLT";
		}
	};
	/**
	 * Date by which cash must be in place in order to take part in the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionCostDebitDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which cash must be in place in order to take part in the event."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode SubscriptionCostDebitDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubscriptionCostDebitDate";
			definition = "Date by which cash must be in place in order to take part in the event.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "SUBS";
		}
	};
	/**
	 * Date/time as from which 'special processing' can start to be used by
	 * participants for that event. Special processing is a means of marking a
	 * transaction, that would normally be traded ex or cum, as being traded cum
	 * or ex respectively, for example, a transaction dealt 'special' after the
	 * ex date would result in the buyer's being eligible for the entitlement.
	 * This is typically used in the UK and Irish markets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SXDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time as from which 'special processing' can start to be used by participants for that event. Special processing is a means of marking a transaction, that would normally be traded ex or cum, as being traded cum or ex respectively, for example, a transaction dealt 'special' after the ex date would result in the buyer's being eligible for the entitlement. This is typically used in the UK and Irish markets."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode SpecialExDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialExDate";
			definition = "Date/time as from which 'special processing' can start to be used by participants for that event. Special processing is a means of marking a transaction, that would normally be traded ex or cum, as being traded cum or ex respectively, for example, a transaction dealt 'special' after the ex date would result in the buyer's being eligible for the entitlement. This is typically used in the UK and Irish markets.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "SXDT";
		}
	};
	/**
	 * Date on until which tax breakdown instructions will be accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAXB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeadlineForTaxBreakdownInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on until which tax breakdown instructions will be accepted."</li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode DeadlineForTaxBreakdownInstructions = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeadlineForTaxBreakdownInstructions";
			definition = "Date on until which tax breakdown instructions will be accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "TAXB";
		}
	};
	/**
	 * Date on which the trade was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the trade was executed."</li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode TradeDateTime = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeDateTime";
			definition = "Date on which the trade was executed.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "TRAD";
		}
	};
	/**
	 * Date on which trading of a security is suspended as the result of an
	 * event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TSDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSuspendedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which trading of a security is suspended as the result of an event."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode TradingSuspendedDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingSuspendedDate";
			definition = "Date on which trading of a security is suspended as the result of an event.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "TSDT";
		}
	};
	/**
	 * Date upon which the terms of the take-over become unconditional.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnconditionalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date upon which the terms of the take-over become unconditional."</li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode UnconditionalDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnconditionalDate";
			definition = "Date upon which the terms of the take-over become unconditional.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "UNCO";
		}
	};
	/**
	 * Date on which assets become available to the account owner (in a credit
	 * entry), or cease to be available to the account owner (in a debit entry).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VALU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which assets become available to the account owner (in a credit entry), or cease to be available to the account owner (in a debit entry)."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode ValueDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date on which assets become available to the account owner (in a credit entry), or cease to be available to the account owner (in a debit entry).";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "VALU";
		}
	};
	/**
	 * Date on which all conditions, including regulatory, legal etc. pertaining
	 * to the take-over, have been met.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WUCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhollyUnconditionalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which all conditions, including regulatory, legal etc. pertaining to the take-over, have been met."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode WhollyUnconditionalDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WhollyUnconditionalDate";
			definition = "Date on which all conditions, including regulatory, legal etc. pertaining to the take-over, have been met.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "WUCO";
		}
	};
	/**
	 * Date as from which trading (including exchange and Over The Counter (OTC)
	 * trading) occurs on the underlying security without the benefit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XDTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExDividendDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date as from which trading (including exchange and Over The Counter (OTC) trading) occurs on the underlying security without the benefit."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode ExDividendDate = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExDividendDate";
			definition = "Date as from which trading (including exchange and Over The Counter (OTC) trading) occurs on the underlying security without the benefit.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "XDTE";
		}
	};
	/**
	 * Date/time at which the account servicer has set as the deadline to
	 * respond, with instructions, to an outstanding event, giving the holder
	 * eligibility to incentives. This time is dependent on the reference time
	 * zone of the account servicer as specified in a Service Level Agreement
	 * (SLA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
	 * CorporateActionReferenceDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EARD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyResponseDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the account servicer has set as the deadline to respond, with instructions, to an outstanding event, giving the holder eligibility to incentives. This time is dependent on the reference time zone of the account servicer as specified in a Service Level Agreement (SLA)."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionReferenceDateCode EarlyResponseDeadline = new CorporateActionReferenceDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EarlyResponseDeadline";
			definition = "Date/time at which the account servicer has set as the deadline to respond, with instructions, to an outstanding event, giving the holder eligibility to incentives. This time is dependent on the reference time zone of the account servicer as specified in a Service Level Agreement (SLA).";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReferenceDateCode.mmObject();
			codeName = "EARD";
		}
	};
	final static private LinkedHashMap<String, CorporateActionReferenceDateCode> codesByName = new LinkedHashMap<>();

	protected CorporateActionReferenceDateCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ANOU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionReferenceDateCode";
				definition = "Specifies the reference date of corporate action, in coded form.";
				derivation_lazy = () -> Arrays.asList(CorporateActionDeadline1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionReferenceDateCode.AnnouncementDate, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.AvailableDate,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.CertificationDeadline, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.ConsentExpirationDate,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.CourtApprovalDate, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.ConsentRecordDate,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.CoverExpirationDate, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.DividendRankingDate,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.EarliestPaymentDate, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.ElectionToCounterpartyDeadline,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.EffectiveDate, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.EqualisationDate,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.ExpiryDate, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.FirstBusinessDayOfMonth,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.FirstCalendarDayOfMonth, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.FurtherDetailedAnnouncementDate,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.CurrencyExchangeDate, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.GuaranteedParticipationDate,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.IndexFixingDate, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.InstructedDate,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.LastBusinessDayOfMonth, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.LastCalendarDayOfMonth,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.LotteryDate, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.MaturityDate,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.MeetingDate, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.SecondMeetingDate,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.ThirdMeetingDate, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.MarginFixingDate,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.MarketDeadline, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.PaymentDate,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.ProtectDate, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.PariPassuDate,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.ProrationDate, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.ResponseDeadline,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.RecordDate, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.RegistrationDeadline,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.ResultsPublicationDate, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.SplitDeadline,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.SubscriptionCostDebitDate, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.SpecialExDate,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.DeadlineForTaxBreakdownInstructions, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.TradeDateTime,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.TradingSuspendedDate, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.UnconditionalDate,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.ValueDate, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.WhollyUnconditionalDate,
						com.tools20022.repository.codeset.CorporateActionReferenceDateCode.ExDividendDate, com.tools20022.repository.codeset.CorporateActionReferenceDateCode.EarlyResponseDeadline);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AnnouncementDate.getCodeName().get(), AnnouncementDate);
		codesByName.put(AvailableDate.getCodeName().get(), AvailableDate);
		codesByName.put(CertificationDeadline.getCodeName().get(), CertificationDeadline);
		codesByName.put(ConsentExpirationDate.getCodeName().get(), ConsentExpirationDate);
		codesByName.put(CourtApprovalDate.getCodeName().get(), CourtApprovalDate);
		codesByName.put(ConsentRecordDate.getCodeName().get(), ConsentRecordDate);
		codesByName.put(CoverExpirationDate.getCodeName().get(), CoverExpirationDate);
		codesByName.put(DividendRankingDate.getCodeName().get(), DividendRankingDate);
		codesByName.put(EarliestPaymentDate.getCodeName().get(), EarliestPaymentDate);
		codesByName.put(ElectionToCounterpartyDeadline.getCodeName().get(), ElectionToCounterpartyDeadline);
		codesByName.put(EffectiveDate.getCodeName().get(), EffectiveDate);
		codesByName.put(EqualisationDate.getCodeName().get(), EqualisationDate);
		codesByName.put(ExpiryDate.getCodeName().get(), ExpiryDate);
		codesByName.put(FirstBusinessDayOfMonth.getCodeName().get(), FirstBusinessDayOfMonth);
		codesByName.put(FirstCalendarDayOfMonth.getCodeName().get(), FirstCalendarDayOfMonth);
		codesByName.put(FurtherDetailedAnnouncementDate.getCodeName().get(), FurtherDetailedAnnouncementDate);
		codesByName.put(CurrencyExchangeDate.getCodeName().get(), CurrencyExchangeDate);
		codesByName.put(GuaranteedParticipationDate.getCodeName().get(), GuaranteedParticipationDate);
		codesByName.put(IndexFixingDate.getCodeName().get(), IndexFixingDate);
		codesByName.put(InstructedDate.getCodeName().get(), InstructedDate);
		codesByName.put(LastBusinessDayOfMonth.getCodeName().get(), LastBusinessDayOfMonth);
		codesByName.put(LastCalendarDayOfMonth.getCodeName().get(), LastCalendarDayOfMonth);
		codesByName.put(LotteryDate.getCodeName().get(), LotteryDate);
		codesByName.put(MaturityDate.getCodeName().get(), MaturityDate);
		codesByName.put(MeetingDate.getCodeName().get(), MeetingDate);
		codesByName.put(SecondMeetingDate.getCodeName().get(), SecondMeetingDate);
		codesByName.put(ThirdMeetingDate.getCodeName().get(), ThirdMeetingDate);
		codesByName.put(MarginFixingDate.getCodeName().get(), MarginFixingDate);
		codesByName.put(MarketDeadline.getCodeName().get(), MarketDeadline);
		codesByName.put(PaymentDate.getCodeName().get(), PaymentDate);
		codesByName.put(ProtectDate.getCodeName().get(), ProtectDate);
		codesByName.put(PariPassuDate.getCodeName().get(), PariPassuDate);
		codesByName.put(ProrationDate.getCodeName().get(), ProrationDate);
		codesByName.put(ResponseDeadline.getCodeName().get(), ResponseDeadline);
		codesByName.put(RecordDate.getCodeName().get(), RecordDate);
		codesByName.put(RegistrationDeadline.getCodeName().get(), RegistrationDeadline);
		codesByName.put(ResultsPublicationDate.getCodeName().get(), ResultsPublicationDate);
		codesByName.put(SplitDeadline.getCodeName().get(), SplitDeadline);
		codesByName.put(SubscriptionCostDebitDate.getCodeName().get(), SubscriptionCostDebitDate);
		codesByName.put(SpecialExDate.getCodeName().get(), SpecialExDate);
		codesByName.put(DeadlineForTaxBreakdownInstructions.getCodeName().get(), DeadlineForTaxBreakdownInstructions);
		codesByName.put(TradeDateTime.getCodeName().get(), TradeDateTime);
		codesByName.put(TradingSuspendedDate.getCodeName().get(), TradingSuspendedDate);
		codesByName.put(UnconditionalDate.getCodeName().get(), UnconditionalDate);
		codesByName.put(ValueDate.getCodeName().get(), ValueDate);
		codesByName.put(WhollyUnconditionalDate.getCodeName().get(), WhollyUnconditionalDate);
		codesByName.put(ExDividendDate.getCodeName().get(), ExDividendDate);
		codesByName.put(EarlyResponseDeadline.getCodeName().get(), EarlyResponseDeadline);
	}

	public static CorporateActionReferenceDateCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionReferenceDateCode[] values() {
		CorporateActionReferenceDateCode[] values = new CorporateActionReferenceDateCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionReferenceDateCode> {
		@Override
		public CorporateActionReferenceDateCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionReferenceDateCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}