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
 * Specifies the type of securities proceeds; whether they are newly issued or
 * not, defeased or non-defeased.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode#ExistingIssue
 * NewSecuritiesIssuanceTypeCode.ExistingIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode#NewIssue
 * NewSecuritiesIssuanceTypeCode.NewIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode#Unknown
 * NewSecuritiesIssuanceTypeCode.Unknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode#DefeasedSecurityIndicator
 * NewSecuritiesIssuanceTypeCode.DefeasedSecurityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode#NonDefeasedSecurityIndicator
 * NewSecuritiesIssuanceTypeCode.NonDefeasedSecurityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode#RefundedSecurityIndicator
 * NewSecuritiesIssuanceTypeCode.RefundedSecurityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode#NonRefundedSecurityIndicator
 * NewSecuritiesIssuanceTypeCode.NonRefundedSecurityIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType1Code
 * NewSecuritiesIssuanceType1Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code
 * NewSecuritiesIssuanceType2Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType3Code
 * NewSecuritiesIssuanceType3Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType4Code
 * NewSecuritiesIssuanceType4Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code
 * NewSecuritiesIssuanceType5Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code
 * NewSecuritiesIssuanceType6Code}</li>
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
 * <li>"EXIS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NewSecuritiesIssuanceTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of securities proceeds; whether they are newly issued or not, defeased or non-defeased."
 * </li>
 * </ul>
 */
public class NewSecuritiesIssuanceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Securities proceeds are not new issues.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode
	 * NewSecuritiesIssuanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExistingIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities proceeds are not new issues."</li>
	 * </ul>
	 */
	public static final MMCode ExistingIssue = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExistingIssue";
			definition = "Securities proceeds are not new issues.";
			owner_lazy = () -> NewSecuritiesIssuanceTypeCode.mmObject();
			codeName = "EXIS";
		}
	};
	/**
	 * Securities proceeds are newly issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode
	 * NewSecuritiesIssuanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NEIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities proceeds are newly issued."</li>
	 * </ul>
	 */
	public static final MMCode NewIssue = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewIssue";
			definition = "Securities proceeds are newly issued.";
			owner_lazy = () -> NewSecuritiesIssuanceTypeCode.mmObject();
			codeName = "NEIS";
		}
	};
	/**
	 * Not known whether the securities proceeds are newly issued or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode
	 * NewSecuritiesIssuanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Not known whether the securities proceeds are newly issued or not."</li>
	 * </ul>
	 */
	public static final MMCode Unknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			definition = "Not known whether the securities proceeds are newly issued or not.";
			owner_lazy = () -> NewSecuritiesIssuanceTypeCode.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * Funds have been placed in escrow by a trustee or agent to ensure payment
	 * on a portion of the outstanding balance of the original security on
	 * maturity date. Applicable only in the frame of a Partial Defeasance PDEF
	 * corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode
	 * NewSecuritiesIssuanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEFE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefeasedSecurityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Funds have been placed in escrow by a trustee or agent to ensure payment on a portion of the outstanding balance of the original security on maturity date.  Applicable only in the frame of a Partial Defeasance PDEF corporate action event. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode DefeasedSecurityIndicator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefeasedSecurityIndicator";
			definition = "Funds have been placed in escrow by a trustee or agent to ensure payment on a portion of the outstanding balance of the original security on maturity date.  Applicable only in the frame of a Partial Defeasance PDEF corporate action event. ";
			owner_lazy = () -> NewSecuritiesIssuanceTypeCode.mmObject();
			codeName = "DEFE";
		}
	};
	/**
	 * Funds will not be guaranteed at maturity by the issuer or paying agent
	 * for this newly issued non-defeased security. Applicable only in the frame
	 * of a Partial Defeasance PDEF corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode
	 * NewSecuritiesIssuanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NDEF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDefeasedSecurityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Funds will not be guaranteed at maturity by the issuer or paying agent for this newly issued non-defeased security.  Applicable only in the frame of a Partial Defeasance PDEF corporate action event. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode NonDefeasedSecurityIndicator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDefeasedSecurityIndicator";
			definition = "Funds will not be guaranteed at maturity by the issuer or paying agent for this newly issued non-defeased security.  Applicable only in the frame of a Partial Defeasance PDEF corporate action event. ";
			owner_lazy = () -> NewSecuritiesIssuanceTypeCode.mmObject();
			codeName = "NDEF";
		}
	};
	/**
	 * New security issued that has been refunded to an earlier maturity date.
	 * Applicable only in the frame of a partial defeasance PDEF corporate
	 * action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode
	 * NewSecuritiesIssuanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REFU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefundedSecurityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "New security issued that has been refunded to an earlier maturity date. Applicable only in the frame of a partial defeasance PDEF corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMCode RefundedSecurityIndicator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundedSecurityIndicator";
			definition = "New security issued that has been refunded to an earlier maturity date. Applicable only in the frame of a partial defeasance PDEF corporate action event.";
			owner_lazy = () -> NewSecuritiesIssuanceTypeCode.mmObject();
			codeName = "REFU";
		}
	};
	/**
	 * New Security issued that has not been refunded and the maturity date of
	 * the original underlying security is unchanged. Applicable only in the
	 * frame of a Partial Defeasance PDEF corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode
	 * NewSecuritiesIssuanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NREF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonRefundedSecurityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "New Security issued that has not been refunded and the maturity date of the original underlying security is unchanged. Applicable only in the frame of a Partial Defeasance PDEF corporate action event. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode NonRefundedSecurityIndicator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonRefundedSecurityIndicator";
			definition = "New Security issued that has not been refunded and the maturity date of the original underlying security is unchanged. Applicable only in the frame of a Partial Defeasance PDEF corporate action event. ";
			owner_lazy = () -> NewSecuritiesIssuanceTypeCode.mmObject();
			codeName = "NREF";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("EXIS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NewSecuritiesIssuanceTypeCode";
				definition = "Specifies the type of securities proceeds; whether they are newly issued or not, defeased or non-defeased.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode.ExistingIssue, com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode.NewIssue,
						com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode.Unknown, com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode.DefeasedSecurityIndicator,
						com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode.NonDefeasedSecurityIndicator, com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode.RefundedSecurityIndicator,
						com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode.NonRefundedSecurityIndicator);
				derivation_lazy = () -> Arrays.asList(NewSecuritiesIssuanceType1Code.mmObject(), NewSecuritiesIssuanceType2Code.mmObject(), NewSecuritiesIssuanceType3Code.mmObject(), NewSecuritiesIssuanceType4Code.mmObject(),
						NewSecuritiesIssuanceType5Code.mmObject(), NewSecuritiesIssuanceType6Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}