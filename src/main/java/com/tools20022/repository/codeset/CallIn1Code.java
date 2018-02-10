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
import com.tools20022.repository.codeset.CallIn1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of pay-in call report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CallIn1Code#CallForAccountValue
 * CallIn1Code.CallForAccountValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CallIn1Code#CallForSettlement
 * CallIn1Code.CallForSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CallIn1Code#CallForCurrencyClose
 * CallIn1Code.CallForCurrencyClose}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CallInCode CallInCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CFAV"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CallIn1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of pay-in call report."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CallIn1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CallIn1Code CallIn1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallForAccountValue"</li>
	 * </ul>
	 */
	public static final CallIn1Code CallForAccountValue = new CallIn1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallForAccountValue";
			owner_lazy = () -> com.tools20022.repository.codeset.CallIn1Code.mmObject();
			codeName = CallInCode.CallForAccountValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CallIn1Code CallIn1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallForSettlement"</li>
	 * </ul>
	 */
	public static final CallIn1Code CallForSettlement = new CallIn1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallForSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.CallIn1Code.mmObject();
			codeName = CallInCode.CallForSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CallIn1Code CallIn1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallForCurrencyClose"</li>
	 * </ul>
	 */
	public static final CallIn1Code CallForCurrencyClose = new CallIn1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallForCurrencyClose";
			owner_lazy = () -> com.tools20022.repository.codeset.CallIn1Code.mmObject();
			codeName = CallInCode.CallForCurrencyClose.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CallIn1Code> codesByName = new LinkedHashMap<>();

	protected CallIn1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CFAV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CallIn1Code";
				definition = "Specifies the type of pay-in call report.";
				trace_lazy = () -> CallInCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CallIn1Code.CallForAccountValue, com.tools20022.repository.codeset.CallIn1Code.CallForSettlement,
						com.tools20022.repository.codeset.CallIn1Code.CallForCurrencyClose);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CallForAccountValue.getCodeName().get(), CallForAccountValue);
		codesByName.put(CallForSettlement.getCodeName().get(), CallForSettlement);
		codesByName.put(CallForCurrencyClose.getCodeName().get(), CallForCurrencyClose);
	}

	public static CallIn1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CallIn1Code[] values() {
		CallIn1Code[] values = new CallIn1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CallIn1Code> {
		@Override
		public CallIn1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CallIn1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}