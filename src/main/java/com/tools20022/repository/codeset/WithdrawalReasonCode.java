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
import com.tools20022.repository.codeset.WithdrawalReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason that an alleged trade is withdrawn.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WithdrawalReasonCode#Rescinded
 * WithdrawalReasonCode.Rescinded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WithdrawalReasonCode#Rejected
 * WithdrawalReasonCode.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WithdrawalReasonCode#Withdrawn
 * WithdrawalReasonCode.Withdrawn}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.WithdrawalReason1Code
 * WithdrawalReason1Code}</li>
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
 * <li>"RSCD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "WithdrawalReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason that an alleged trade is withdrawn."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class WithdrawalReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Alleged trade is rescinded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WithdrawalReasonCode
	 * WithdrawalReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rescinded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Alleged trade is rescinded."</li>
	 * </ul>
	 */
	public static final WithdrawalReasonCode Rescinded = new WithdrawalReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rescinded";
			definition = "Alleged trade is rescinded.";
			owner_lazy = () -> com.tools20022.repository.codeset.WithdrawalReasonCode.mmObject();
			codeName = "RSCD";
		}
	};
	/**
	 * Alleged trade is rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WithdrawalReasonCode
	 * WithdrawalReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Alleged trade is rejected."</li>
	 * </ul>
	 */
	public static final WithdrawalReasonCode Rejected = new WithdrawalReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Alleged trade is rejected.";
			owner_lazy = () -> com.tools20022.repository.codeset.WithdrawalReasonCode.mmObject();
			codeName = "RJCT";
		}
	};
	/**
	 * Alleged trade is withdrawn due to an amendment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WithdrawalReasonCode
	 * WithdrawalReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WTDN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Alleged trade is withdrawn due to an amendment."</li>
	 * </ul>
	 */
	public static final WithdrawalReasonCode Withdrawn = new WithdrawalReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawn";
			definition = "Alleged trade is withdrawn due to an amendment.";
			owner_lazy = () -> com.tools20022.repository.codeset.WithdrawalReasonCode.mmObject();
			codeName = "WTDN";
		}
	};
	final static private LinkedHashMap<String, WithdrawalReasonCode> codesByName = new LinkedHashMap<>();

	protected WithdrawalReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RSCD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "WithdrawalReasonCode";
				definition = "Specifies the reason that an alleged trade is withdrawn.";
				derivation_lazy = () -> Arrays.asList(WithdrawalReason1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.WithdrawalReasonCode.Rescinded, com.tools20022.repository.codeset.WithdrawalReasonCode.Rejected,
						com.tools20022.repository.codeset.WithdrawalReasonCode.Withdrawn);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Rescinded.getCodeName().get(), Rescinded);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Withdrawn.getCodeName().get(), Withdrawn);
	}

	public static WithdrawalReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static WithdrawalReasonCode[] values() {
		WithdrawalReasonCode[] values = new WithdrawalReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, WithdrawalReasonCode> {
		@Override
		public WithdrawalReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(WithdrawalReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}