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
import com.tools20022.repository.codeset.MoneyLaunderingCheck1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of money laundering identification procedures.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheck1Code#Passed
 * MoneyLaunderingCheck1Code.Passed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheck1Code#NotChecked
 * MoneyLaunderingCheck1Code.NotChecked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheck1Code#ExemptBelowLimit
 * MoneyLaunderingCheck1Code.ExemptBelowLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheck1Code#ClientMoneyTypeExempt
 * MoneyLaunderingCheck1Code.ClientMoneyTypeExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheck1Code#AuthorisedCredit
 * MoneyLaunderingCheck1Code.AuthorisedCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheck1Code#PostalOrElectronicPaymentExempt
 * MoneyLaunderingCheck1Code.PostalOrElectronicPaymentExempt}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheckCode
 * MoneyLaunderingCheckCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MoneyLaunderingCheck1Code extends MMCode {

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
	public static final MoneyLaunderingCheck1Code Passed = new MoneyLaunderingCheck1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Passed";
			owner_lazy = () -> com.tools20022.repository.codeset.MoneyLaunderingCheck1Code.mmObject();
			codeName = MoneyLaunderingCheckCode.Passed.getCodeName().orElse(name);
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
	public static final MoneyLaunderingCheck1Code NotChecked = new MoneyLaunderingCheck1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotChecked";
			owner_lazy = () -> com.tools20022.repository.codeset.MoneyLaunderingCheck1Code.mmObject();
			codeName = MoneyLaunderingCheckCode.NotChecked.getCodeName().orElse(name);
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
	public static final MoneyLaunderingCheck1Code ExemptBelowLimit = new MoneyLaunderingCheck1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptBelowLimit";
			owner_lazy = () -> com.tools20022.repository.codeset.MoneyLaunderingCheck1Code.mmObject();
			codeName = MoneyLaunderingCheckCode.ExemptBelowLimit.getCodeName().orElse(name);
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
	public static final MoneyLaunderingCheck1Code ClientMoneyTypeExempt = new MoneyLaunderingCheck1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientMoneyTypeExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.MoneyLaunderingCheck1Code.mmObject();
			codeName = MoneyLaunderingCheckCode.ClientMoneyTypeExempt.getCodeName().orElse(name);
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
	public static final MoneyLaunderingCheck1Code AuthorisedCredit = new MoneyLaunderingCheck1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedCredit";
			owner_lazy = () -> com.tools20022.repository.codeset.MoneyLaunderingCheck1Code.mmObject();
			codeName = MoneyLaunderingCheckCode.AuthorisedCredit.getCodeName().orElse(name);
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
	public static final MoneyLaunderingCheck1Code PostalOrElectronicPaymentExempt = new MoneyLaunderingCheck1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalOrElectronicPaymentExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.MoneyLaunderingCheck1Code.mmObject();
			codeName = MoneyLaunderingCheckCode.PostalOrElectronicPaymentExempt.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MoneyLaunderingCheck1Code> codesByName = new LinkedHashMap<>();

	protected MoneyLaunderingCheck1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PASS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MoneyLaunderingCheck1Code";
				definition = "Specifies the status of money laundering identification procedures.";
				trace_lazy = () -> MoneyLaunderingCheckCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MoneyLaunderingCheck1Code.Passed, com.tools20022.repository.codeset.MoneyLaunderingCheck1Code.NotChecked,
						com.tools20022.repository.codeset.MoneyLaunderingCheck1Code.ExemptBelowLimit, com.tools20022.repository.codeset.MoneyLaunderingCheck1Code.ClientMoneyTypeExempt,
						com.tools20022.repository.codeset.MoneyLaunderingCheck1Code.AuthorisedCredit, com.tools20022.repository.codeset.MoneyLaunderingCheck1Code.PostalOrElectronicPaymentExempt);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Passed.getCodeName().get(), Passed);
		codesByName.put(NotChecked.getCodeName().get(), NotChecked);
		codesByName.put(ExemptBelowLimit.getCodeName().get(), ExemptBelowLimit);
		codesByName.put(ClientMoneyTypeExempt.getCodeName().get(), ClientMoneyTypeExempt);
		codesByName.put(AuthorisedCredit.getCodeName().get(), AuthorisedCredit);
		codesByName.put(PostalOrElectronicPaymentExempt.getCodeName().get(), PostalOrElectronicPaymentExempt);
	}

	public static MoneyLaunderingCheck1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MoneyLaunderingCheck1Code[] values() {
		MoneyLaunderingCheck1Code[] values = new MoneyLaunderingCheck1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MoneyLaunderingCheck1Code> {
		@Override
		public MoneyLaunderingCheck1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MoneyLaunderingCheck1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}