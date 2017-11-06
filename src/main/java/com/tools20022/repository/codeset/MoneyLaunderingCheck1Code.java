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
import com.tools20022.repository.codeset.MoneyLaunderingCheckCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of money laundering identification procedures.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheckCode
 * MoneyLaunderingCheckCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheck1Code#mmPassed
 * MoneyLaunderingCheck1Code.mmPassed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheck1Code#mmNotChecked
 * MoneyLaunderingCheck1Code.mmNotChecked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheck1Code#mmExemptBelowLimit
 * MoneyLaunderingCheck1Code.mmExemptBelowLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheck1Code#mmClientMoneyTypeExempt
 * MoneyLaunderingCheck1Code.mmClientMoneyTypeExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheck1Code#mmAuthorisedCredit
 * MoneyLaunderingCheck1Code.mmAuthorisedCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheck1Code#mmPostalOrElectronicPaymentExempt
 * MoneyLaunderingCheck1Code.mmPostalOrElectronicPaymentExempt}</li>
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
 * <li>"PASS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MoneyLaunderingCheck1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of money laundering identification procedures."</li>
 * </ul>
 */
public class MoneyLaunderingCheck1Code extends MoneyLaunderingCheckCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheck1Code
	 * MoneyLaunderingCheck1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Passed"</li>
	 * </ul>
	 */
	public static final MMCode mmPassed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Passed";
			owner_lazy = () -> MoneyLaunderingCheck1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheck1Code
	 * MoneyLaunderingCheck1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotChecked"</li>
	 * </ul>
	 */
	public static final MMCode mmNotChecked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotChecked";
			owner_lazy = () -> MoneyLaunderingCheck1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheck1Code
	 * MoneyLaunderingCheck1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptBelowLimit"</li>
	 * </ul>
	 */
	public static final MMCode mmExemptBelowLimit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptBelowLimit";
			owner_lazy = () -> MoneyLaunderingCheck1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheck1Code
	 * MoneyLaunderingCheck1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientMoneyTypeExempt"</li>
	 * </ul>
	 */
	public static final MMCode mmClientMoneyTypeExempt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientMoneyTypeExempt";
			owner_lazy = () -> MoneyLaunderingCheck1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheck1Code
	 * MoneyLaunderingCheck1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedCredit"</li>
	 * </ul>
	 */
	public static final MMCode mmAuthorisedCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedCredit";
			owner_lazy = () -> MoneyLaunderingCheck1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheck1Code
	 * MoneyLaunderingCheck1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalOrElectronicPaymentExempt"</li>
	 * </ul>
	 */
	public static final MMCode mmPostalOrElectronicPaymentExempt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalOrElectronicPaymentExempt";
			owner_lazy = () -> MoneyLaunderingCheck1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("PASS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MoneyLaunderingCheck1Code";
				definition = "Specifies the status of money laundering identification procedures.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MoneyLaunderingCheck1Code.mmPassed, com.tools20022.repository.codeset.MoneyLaunderingCheck1Code.mmNotChecked,
						com.tools20022.repository.codeset.MoneyLaunderingCheck1Code.mmExemptBelowLimit, com.tools20022.repository.codeset.MoneyLaunderingCheck1Code.mmClientMoneyTypeExempt,
						com.tools20022.repository.codeset.MoneyLaunderingCheck1Code.mmAuthorisedCredit, com.tools20022.repository.codeset.MoneyLaunderingCheck1Code.mmPostalOrElectronicPaymentExempt);
				trace_lazy = () -> MoneyLaunderingCheckCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}