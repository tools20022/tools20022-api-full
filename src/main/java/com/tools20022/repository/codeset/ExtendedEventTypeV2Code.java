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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies DTCC (The Depository Trust and Clearing Corporation) defined
 * corporate action event type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code#mmMeeting
 * ExtendedEventTypeV2Code.mmMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code#mmRightsPlanAdoption
 * ExtendedEventTypeV2Code.mmRightsPlanAdoption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code#mmTermination
 * ExtendedEventTypeV2Code.mmTermination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code#mmBonusRightsIssue
 * ExtendedEventTypeV2Code.mmBonusRightsIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code#mmFullPrerefunding
 * ExtendedEventTypeV2Code.mmFullPrerefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code#mmPartialDefeasance
 * ExtendedEventTypeV2Code.mmPartialDefeasance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code#mmPartialPrerefunding
 * ExtendedEventTypeV2Code.mmPartialPrerefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code#mmPartialMandatoryPut
 * ExtendedEventTypeV2Code.mmPartialMandatoryPut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code#mmCertificateOfDepositEarlyRedemption
 * ExtendedEventTypeV2Code.mmCertificateOfDepositEarlyRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code#mmFinalPaydown
 * ExtendedEventTypeV2Code.mmFinalPaydown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ExtendedEventType2Code
 * ExtendedEventType2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExtendedEventType3Code
 * ExtendedEventType3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExtendedEventType4Code
 * ExtendedEventType4Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MEET"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExtendedEventTypeV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTCC (The Depository Trust and Clearing Corporation) defined corporate action event type."
 * </li>
 * </ul>
 */
public class ExtendedEventTypeV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Meeting of a company's share or bond holders to address resolutions put
	 * forth by the issuer. Note: this is information only event. Pending
	 * deprecation and migration to ISO Proxy Message suite.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code
	 * ExtendedEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MEET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Meeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Meeting of a company's share or bond holders to address resolutions put forth by the issuer. Note: this is information only event. Pending deprecation and migration to ISO Proxy Message suite."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMeeting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Meeting";
			definition = "Meeting of a company's share or bond holders to address resolutions put forth by the issuer. Note: this is information only event. Pending deprecation and migration to ISO Proxy Message suite.";
			owner_lazy = () -> ExtendedEventTypeV2Code.mmObject();
			codeName = "MEET";
		}
	};
	/**
	 * General information provided by the issuer that should not result in
	 * material changes to the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code
	 * ExtendedEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RPLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsPlanAdoption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information provided by the issuer that should not result in material changes to the security."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRightsPlanAdoption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsPlanAdoption";
			definition = "General information provided by the issuer that should not result in material changes to the security.";
			owner_lazy = () -> ExtendedEventTypeV2Code.mmObject();
			codeName = "RPLA";
		}
	};
	/**
	 * Security, usually a form of a derivative, for which the agent or issuer
	 * has decided to terminate the derivative based on a change to the
	 * underlying security(ies) or a change in strategy. Distinguishes from
	 * Mandatory Exchange, Exchange Offer event types mapped to the same ISO
	 * event type code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code
	 * ExtendedEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TMTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Termination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security, usually a form of a derivative, for which the agent or issuer has decided to terminate the derivative based on a change to the underlying security(ies) or a change in strategy. Distinguishes from  Mandatory Exchange, Exchange Offer event types mapped to the same ISO event type code."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTermination = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Termination";
			definition = "Security, usually a form of a derivative, for which the agent or issuer has decided to terminate the derivative based on a change to the underlying security(ies) or a change in strategy. Distinguishes from  Mandatory Exchange, Exchange Offer event types mapped to the same ISO event type code.";
			owner_lazy = () -> ExtendedEventTypeV2Code.mmObject();
			codeName = "TMTN";
		}
	};
	/**
	 * Security holders are issued additional securities, free of payment, from
	 * the issuer in proportion to their holdings. A bonus issue is typically
	 * represented by shares or warrants. Nominal value does not change. The
	 * security holder may be offered choice of entitlement. Distinguishes from
	 * Rights Subscription, Sale Of Rights event types mapped to the same ISO
	 * event type code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code
	 * ExtendedEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusRightsIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security holders are issued additional securities, free of payment, from the issuer in proportion to their holdings. A bonus issue is typically represented by shares or warrants. Nominal value does not change. The security holder may be offered choice of entitlement. Distinguishes from  Rights Subscription, Sale Of Rights event types mapped to the same ISO event type code."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBonusRightsIssue = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BonusRightsIssue";
			definition = "Security holders are issued additional securities, free of payment, from the issuer in proportion to their holdings. A bonus issue is typically represented by shares or warrants. Nominal value does not change. The security holder may be offered choice of entitlement. Distinguishes from  Rights Subscription, Sale Of Rights event types mapped to the same ISO event type code.";
			owner_lazy = () -> ExtendedEventTypeV2Code.mmObject();
			codeName = "BRIS";
		}
	};
	/**
	 * Exercise of a privilege by the issuer to repay, in full, any debt
	 * security prior to maturity when the issuer deposits assets in trust. This
	 * irrevocably restricts their use to satisfaction of the debt.
	 * Distinguishes from "partial defeasance", "partial prerefunding" event
	 * types mapped to the same ISO event type code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code
	 * ExtendedEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullPrerefunding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exercise of a privilege by the issuer to repay, in full, any debt security prior to maturity when the issuer deposits assets in trust. This irrevocably restricts their use to satisfaction of the debt. Distinguishes from  \"partial defeasance\", \"partial prerefunding\" event types mapped to the same ISO event type code."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFullPrerefunding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullPrerefunding";
			definition = "Exercise of a privilege by the issuer to repay, in full, any debt security prior to maturity when the issuer deposits assets in trust. This irrevocably restricts their use to satisfaction of the debt. Distinguishes from  \"partial defeasance\", \"partial prerefunding\" event types mapped to the same ISO event type code.";
			owner_lazy = () -> ExtendedEventTypeV2Code.mmObject();
			codeName = "FLPR";
		}
	};
	/**
	 * Issuer sets aside funds in escrow to guarantee payment for the portion of
	 * the security on maturity date. Defeased and Non-defeased cusips are
	 * issued respectively for the defeased and non-defeased portions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code
	 * ExtendedEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDEF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialDefeasance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issuer sets aside funds in escrow to guarantee payment for the portion of the security on maturity date. Defeased and Non-defeased cusips are issued respectively for the defeased and non-defeased portions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPartialDefeasance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialDefeasance";
			definition = "Issuer sets aside funds in escrow to guarantee payment for the portion of the security on maturity date. Defeased and Non-defeased cusips are issued respectively for the defeased and non-defeased portions.";
			owner_lazy = () -> ExtendedEventTypeV2Code.mmObject();
			codeName = "PDEF";
		}
	};
	/**
	 * Issuer sets aside funds in escrow to guarantee payment for the portion of
	 * the security prior to maturity date. Refunded and Non-Refunded cusips are
	 * issued respectively for the refunded and non-refunded portions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code
	 * ExtendedEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PPRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialPrerefunding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issuer sets aside funds in escrow to guarantee payment for the portion of the security prior to maturity date. Refunded and Non-Refunded cusips are issued respectively for the refunded and non-refunded portions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPartialPrerefunding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialPrerefunding";
			definition = "Issuer sets aside funds in escrow to guarantee payment for the portion of the security prior to maturity date. Refunded and Non-Refunded cusips are issued respectively for the refunded and non-refunded portions.";
			owner_lazy = () -> ExtendedEventTypeV2Code.mmObject();
			codeName = "PPRE";
		}
	};
	/**
	 * The mandatory exchange of a portion of bonds where the exchanged
	 * securities are usually remarketed. The issuer may offer holders the right
	 * to retain instead of exchanging their securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code
	 * ExtendedEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PPUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialMandatoryPut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The mandatory exchange of a portion of bonds where the exchanged securities are usually remarketed. The issuer may offer holders the right to retain instead of exchanging their securities."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPartialMandatoryPut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialMandatoryPut";
			definition = "The mandatory exchange of a portion of bonds where the exchanged securities are usually remarketed. The issuer may offer holders the right to retain instead of exchanging their securities.";
			owner_lazy = () -> ExtendedEventTypeV2Code.mmObject();
			codeName = "PPUT";
		}
	};
	/**
	 * Feature of a security that allows an issuer to make a payment to the
	 * security holder. This event will be used for securities subject to
	 * redemptions other than those categorized as full and partial calls (for
	 * example early Certificate of Deposit redemptions).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code
	 * ExtendedEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateOfDepositEarlyRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Feature of a security that allows an issuer to make a payment to the security holder. This event will be used for securities subject to redemptions other than those categorized as full and partial calls (for example early Certificate of Deposit redemptions)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCertificateOfDepositEarlyRedemption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateOfDepositEarlyRedemption";
			definition = "Feature of a security that allows an issuer to make a payment to the security holder. This event will be used for securities subject to redemptions other than those categorized as full and partial calls (for example early Certificate of Deposit redemptions).";
			owner_lazy = () -> ExtendedEventTypeV2Code.mmObject();
			codeName = "CDRD";
		}
	};
	/**
	 * Final distribution of principal due on a security, typically
	 * Collateralised Mortgage Obligations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code
	 * ExtendedEventTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FPAY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalPaydown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Final distribution of principal due on a security, typically Collateralised Mortgage Obligations."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFinalPaydown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalPaydown";
			definition = "Final distribution of principal due on a security, typically Collateralised Mortgage Obligations.";
			owner_lazy = () -> ExtendedEventTypeV2Code.mmObject();
			codeName = "FPAY";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("MEET");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExtendedEventTypeV2Code";
				definition = "Specifies DTCC (The Depository Trust and Clearing Corporation) defined corporate action event type.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExtendedEventTypeV2Code.mmMeeting, com.tools20022.repository.codeset.ExtendedEventTypeV2Code.mmRightsPlanAdoption,
						com.tools20022.repository.codeset.ExtendedEventTypeV2Code.mmTermination, com.tools20022.repository.codeset.ExtendedEventTypeV2Code.mmBonusRightsIssue,
						com.tools20022.repository.codeset.ExtendedEventTypeV2Code.mmFullPrerefunding, com.tools20022.repository.codeset.ExtendedEventTypeV2Code.mmPartialDefeasance,
						com.tools20022.repository.codeset.ExtendedEventTypeV2Code.mmPartialPrerefunding, com.tools20022.repository.codeset.ExtendedEventTypeV2Code.mmPartialMandatoryPut,
						com.tools20022.repository.codeset.ExtendedEventTypeV2Code.mmCertificateOfDepositEarlyRedemption, com.tools20022.repository.codeset.ExtendedEventTypeV2Code.mmFinalPaydown);
				derivation_lazy = () -> Arrays.asList(ExtendedEventType2Code.mmObject(), ExtendedEventType3Code.mmObject(), ExtendedEventType4Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}