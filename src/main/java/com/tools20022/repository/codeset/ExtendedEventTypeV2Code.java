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
import com.tools20022.repository.codeset.ExtendedEventTypeV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies DTCC (The Depository Trust and Clearing Corporation) defined
 * corporate action event type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code#Meeting
 * ExtendedEventTypeV2Code.Meeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code#RightsPlanAdoption
 * ExtendedEventTypeV2Code.RightsPlanAdoption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code#Termination
 * ExtendedEventTypeV2Code.Termination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code#BonusRightsIssue
 * ExtendedEventTypeV2Code.BonusRightsIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code#FullPrerefunding
 * ExtendedEventTypeV2Code.FullPrerefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code#PartialDefeasance
 * ExtendedEventTypeV2Code.PartialDefeasance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code#PartialPrerefunding
 * ExtendedEventTypeV2Code.PartialPrerefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code#PartialMandatoryPut
 * ExtendedEventTypeV2Code.PartialMandatoryPut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code#CertificateOfDepositEarlyRedemption
 * ExtendedEventTypeV2Code.CertificateOfDepositEarlyRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code#FinalPaydown
 * ExtendedEventTypeV2Code.FinalPaydown}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExtendedEventTypeV2Code extends MMCode {

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
	public static final ExtendedEventTypeV2Code Meeting = new ExtendedEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Meeting";
			definition = "Meeting of a company's share or bond holders to address resolutions put forth by the issuer. Note: this is information only event. Pending deprecation and migration to ISO Proxy Message suite.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventTypeV2Code.mmObject();
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
	public static final ExtendedEventTypeV2Code RightsPlanAdoption = new ExtendedEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsPlanAdoption";
			definition = "General information provided by the issuer that should not result in material changes to the security.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventTypeV2Code.mmObject();
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
	public static final ExtendedEventTypeV2Code Termination = new ExtendedEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Termination";
			definition = "Security, usually a form of a derivative, for which the agent or issuer has decided to terminate the derivative based on a change to the underlying security(ies) or a change in strategy. Distinguishes from  Mandatory Exchange, Exchange Offer event types mapped to the same ISO event type code.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventTypeV2Code.mmObject();
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
	public static final ExtendedEventTypeV2Code BonusRightsIssue = new ExtendedEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BonusRightsIssue";
			definition = "Security holders are issued additional securities, free of payment, from the issuer in proportion to their holdings. A bonus issue is typically represented by shares or warrants. Nominal value does not change. The security holder may be offered choice of entitlement. Distinguishes from  Rights Subscription, Sale Of Rights event types mapped to the same ISO event type code.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventTypeV2Code.mmObject();
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
	public static final ExtendedEventTypeV2Code FullPrerefunding = new ExtendedEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullPrerefunding";
			definition = "Exercise of a privilege by the issuer to repay, in full, any debt security prior to maturity when the issuer deposits assets in trust. This irrevocably restricts their use to satisfaction of the debt. Distinguishes from  \"partial defeasance\", \"partial prerefunding\" event types mapped to the same ISO event type code.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventTypeV2Code.mmObject();
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
	public static final ExtendedEventTypeV2Code PartialDefeasance = new ExtendedEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialDefeasance";
			definition = "Issuer sets aside funds in escrow to guarantee payment for the portion of the security on maturity date. Defeased and Non-defeased cusips are issued respectively for the defeased and non-defeased portions.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventTypeV2Code.mmObject();
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
	public static final ExtendedEventTypeV2Code PartialPrerefunding = new ExtendedEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialPrerefunding";
			definition = "Issuer sets aside funds in escrow to guarantee payment for the portion of the security prior to maturity date. Refunded and Non-Refunded cusips are issued respectively for the refunded and non-refunded portions.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventTypeV2Code.mmObject();
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
	public static final ExtendedEventTypeV2Code PartialMandatoryPut = new ExtendedEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialMandatoryPut";
			definition = "The mandatory exchange of a portion of bonds where the exchanged securities are usually remarketed. The issuer may offer holders the right to retain instead of exchanging their securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventTypeV2Code.mmObject();
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
	public static final ExtendedEventTypeV2Code CertificateOfDepositEarlyRedemption = new ExtendedEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateOfDepositEarlyRedemption";
			definition = "Feature of a security that allows an issuer to make a payment to the security holder. This event will be used for securities subject to redemptions other than those categorized as full and partial calls (for example early Certificate of Deposit redemptions).";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventTypeV2Code.mmObject();
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
	public static final ExtendedEventTypeV2Code FinalPaydown = new ExtendedEventTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalPaydown";
			definition = "Final distribution of principal due on a security, typically Collateralised Mortgage Obligations.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventTypeV2Code.mmObject();
			codeName = "FPAY";
		}
	};
	final static private LinkedHashMap<String, ExtendedEventTypeV2Code> codesByName = new LinkedHashMap<>();

	protected ExtendedEventTypeV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MEET");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExtendedEventTypeV2Code";
				definition = "Specifies DTCC (The Depository Trust and Clearing Corporation) defined corporate action event type.";
				derivation_lazy = () -> Arrays.asList(ExtendedEventType2Code.mmObject(), ExtendedEventType3Code.mmObject(), ExtendedEventType4Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExtendedEventTypeV2Code.Meeting, com.tools20022.repository.codeset.ExtendedEventTypeV2Code.RightsPlanAdoption,
						com.tools20022.repository.codeset.ExtendedEventTypeV2Code.Termination, com.tools20022.repository.codeset.ExtendedEventTypeV2Code.BonusRightsIssue,
						com.tools20022.repository.codeset.ExtendedEventTypeV2Code.FullPrerefunding, com.tools20022.repository.codeset.ExtendedEventTypeV2Code.PartialDefeasance,
						com.tools20022.repository.codeset.ExtendedEventTypeV2Code.PartialPrerefunding, com.tools20022.repository.codeset.ExtendedEventTypeV2Code.PartialMandatoryPut,
						com.tools20022.repository.codeset.ExtendedEventTypeV2Code.CertificateOfDepositEarlyRedemption, com.tools20022.repository.codeset.ExtendedEventTypeV2Code.FinalPaydown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Meeting.getCodeName().get(), Meeting);
		codesByName.put(RightsPlanAdoption.getCodeName().get(), RightsPlanAdoption);
		codesByName.put(Termination.getCodeName().get(), Termination);
		codesByName.put(BonusRightsIssue.getCodeName().get(), BonusRightsIssue);
		codesByName.put(FullPrerefunding.getCodeName().get(), FullPrerefunding);
		codesByName.put(PartialDefeasance.getCodeName().get(), PartialDefeasance);
		codesByName.put(PartialPrerefunding.getCodeName().get(), PartialPrerefunding);
		codesByName.put(PartialMandatoryPut.getCodeName().get(), PartialMandatoryPut);
		codesByName.put(CertificateOfDepositEarlyRedemption.getCodeName().get(), CertificateOfDepositEarlyRedemption);
		codesByName.put(FinalPaydown.getCodeName().get(), FinalPaydown);
	}

	public static ExtendedEventTypeV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExtendedEventTypeV2Code[] values() {
		ExtendedEventTypeV2Code[] values = new ExtendedEventTypeV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExtendedEventTypeV2Code> {
		@Override
		public ExtendedEventTypeV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExtendedEventTypeV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}