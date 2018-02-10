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
import com.tools20022.repository.codeset.ExtendedEventTypeCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeCode#Meeting
 * ExtendedEventTypeCode.Meeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeCode#RightsPlanAdoption
 * ExtendedEventTypeCode.RightsPlanAdoption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeCode#Termination
 * ExtendedEventTypeCode.Termination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeCode#BonusRightsIssue
 * ExtendedEventTypeCode.BonusRightsIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeCode#FullPrerefunding
 * ExtendedEventTypeCode.FullPrerefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeCode#PartialDefeasance
 * ExtendedEventTypeCode.PartialDefeasance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeCode#PartialPrerefunding
 * ExtendedEventTypeCode.PartialPrerefunding}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ExtendedEventType1Code
 * ExtendedEventType1Code}</li>
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
 * "ExtendedEventTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTCC (The Depository Trust and Clearing Corporation) defined corporate action event type."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExtendedEventTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Meeting of a company's share or bond holders to address resolutions put
	 * forth by the issuer. Note: this is information only event. Pending
	 * deprecation and migration to ISO Proxy Message suite.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeCode
	 * ExtendedEventTypeCode}</li>
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
	public static final ExtendedEventTypeCode Meeting = new ExtendedEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Meeting";
			definition = "Meeting of a company's share or bond holders to address resolutions put forth by the issuer. Note: this is information only event. Pending deprecation and migration to ISO Proxy Message suite.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeCode
	 * ExtendedEventTypeCode}</li>
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
	public static final ExtendedEventTypeCode RightsPlanAdoption = new ExtendedEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsPlanAdoption";
			definition = "General information provided by the issuer that should not result in material changes to the security.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeCode
	 * ExtendedEventTypeCode}</li>
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
	 * "Security, usually a form of a derivative, for which the agent or issuer has decided to terminate the derivative based on a change to the underlying security(ies) or a change in strategy. Distinguishes from Mandatory Exchange, Exchange Offer event types mapped to the same ISO event type code."
	 * </li>
	 * </ul>
	 */
	public static final ExtendedEventTypeCode Termination = new ExtendedEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Termination";
			definition = "Security, usually a form of a derivative, for which the agent or issuer has decided to terminate the derivative based on a change to the underlying security(ies) or a change in strategy. Distinguishes from Mandatory Exchange, Exchange Offer event types mapped to the same ISO event type code.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeCode
	 * ExtendedEventTypeCode}</li>
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
	 * "Security holders are issued additional securities, free of payment, from the issuer in proportion to their holdings. A bonus issue is typically represented by shares or warrants. Nominal value does not change. The security holder may be offered choice of entitlement. Distinguishes from Rights Subscription, Sale Of Rights event types mapped to the same ISO event type code."
	 * </li>
	 * </ul>
	 */
	public static final ExtendedEventTypeCode BonusRightsIssue = new ExtendedEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BonusRightsIssue";
			definition = "Security holders are issued additional securities, free of payment, from the issuer in proportion to their holdings. A bonus issue is typically represented by shares or warrants. Nominal value does not change. The security holder may be offered choice of entitlement. Distinguishes from Rights Subscription, Sale Of Rights event types mapped to the same ISO event type code.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeCode
	 * ExtendedEventTypeCode}</li>
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
	 * "Exercise of a privilege by the issuer to repay, in full, any debt security prior to maturity when the issuer deposits assets in trust. This irrevocably restricts their use to satisfaction of the debt. Distinguishes from \"partial defeasance\", \"partial prerefunding\" event types mapped to the same ISO event type code."
	 * </li>
	 * </ul>
	 */
	public static final ExtendedEventTypeCode FullPrerefunding = new ExtendedEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullPrerefunding";
			definition = "Exercise of a privilege by the issuer to repay, in full, any debt security prior to maturity when the issuer deposits assets in trust. This irrevocably restricts their use to satisfaction of the debt. Distinguishes from \"partial defeasance\", \"partial prerefunding\" event types mapped to the same ISO event type code.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventTypeCode.mmObject();
			codeName = "FLPR";
		}
	};
	/**
	 * Issuer sets aside cash in escrow to pay off a portion of the issue before
	 * the maturity date. New securities are issued for the portion defeased.
	 * Distinguishes from "full prerefunding", "partial prerefunding" event
	 * types mapped to the same ISO event type code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeCode
	 * ExtendedEventTypeCode}</li>
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
	 * "Issuer sets aside cash in escrow to pay off a portion of the issue before the maturity date. New securities are issued for the portion defeased. Distinguishes from \"full prerefunding\", \"partial prerefunding\" event types mapped to the same ISO event type code."
	 * </li>
	 * </ul>
	 */
	public static final ExtendedEventTypeCode PartialDefeasance = new ExtendedEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialDefeasance";
			definition = "Issuer sets aside cash in escrow to pay off a portion of the issue before the maturity date. New securities are issued for the portion defeased. Distinguishes from \"full prerefunding\", \"partial prerefunding\" event types mapped to the same ISO event type code.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventTypeCode.mmObject();
			codeName = "PDEF";
		}
	};
	/**
	 * Similar to a Full Prerefunding, a partial prerefunding is the exercise of
	 * a privilege by the issuer to repay, in part, any debt security prior to
	 * maturity when the issuer deposits assets in trust. This irrevocably
	 * restricts their use to satisfaction of the debt. New securities are
	 * issued for the portion prerefunded. Distinguishes from
	 * "full prerefunding", "partial defeasance" event types mapped to the same
	 * ISO event type code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeCode
	 * ExtendedEventTypeCode}</li>
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
	 * "Similar to a Full Prerefunding, a partial prerefunding is the exercise of a privilege by the issuer to repay, in part, any debt security prior to maturity when the issuer deposits assets in trust. This irrevocably restricts their use to satisfaction of the debt. New securities are issued for the portion prerefunded. Distinguishes from \"full prerefunding\", \"partial defeasance\" event types mapped to the same ISO event type code."
	 * </li>
	 * </ul>
	 */
	public static final ExtendedEventTypeCode PartialPrerefunding = new ExtendedEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialPrerefunding";
			definition = "Similar to a Full Prerefunding, a partial prerefunding is the exercise of a privilege by the issuer to repay, in part, any debt security prior to maturity when the issuer deposits assets in trust. This irrevocably restricts their use to satisfaction of the debt. New securities are issued for the portion prerefunded. Distinguishes from \"full prerefunding\", \"partial defeasance\" event types mapped to the same ISO event type code.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventTypeCode.mmObject();
			codeName = "PPRE";
		}
	};
	final static private LinkedHashMap<String, ExtendedEventTypeCode> codesByName = new LinkedHashMap<>();

	protected ExtendedEventTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MEET");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExtendedEventTypeCode";
				definition = "Specifies DTCC (The Depository Trust and Clearing Corporation) defined corporate action event type.";
				derivation_lazy = () -> Arrays.asList(ExtendedEventType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExtendedEventTypeCode.Meeting, com.tools20022.repository.codeset.ExtendedEventTypeCode.RightsPlanAdoption,
						com.tools20022.repository.codeset.ExtendedEventTypeCode.Termination, com.tools20022.repository.codeset.ExtendedEventTypeCode.BonusRightsIssue,
						com.tools20022.repository.codeset.ExtendedEventTypeCode.FullPrerefunding, com.tools20022.repository.codeset.ExtendedEventTypeCode.PartialDefeasance,
						com.tools20022.repository.codeset.ExtendedEventTypeCode.PartialPrerefunding);
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
	}

	public static ExtendedEventTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExtendedEventTypeCode[] values() {
		ExtendedEventTypeCode[] values = new ExtendedEventTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExtendedEventTypeCode> {
		@Override
		public ExtendedEventTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExtendedEventTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}