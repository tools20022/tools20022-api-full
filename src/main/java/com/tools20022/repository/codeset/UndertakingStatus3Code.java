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
import com.tools20022.repository.codeset.UndertakingStatus3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the undertaking status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UndertakingStatus3Code#Accepted
 * UndertakingStatus3Code.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UndertakingStatus3Code#NonConfirmation
 * UndertakingStatus3Code.NonConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UndertakingStatus3Code#Rejected
 * UndertakingStatus3Code.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UndertakingStatus3Code#Withdrawn
 * UndertakingStatus3Code.Withdrawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UndertakingStatus3Code#CounterUndertakingAmountChange
 * UndertakingStatus3Code.CounterUndertakingAmountChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UndertakingStatus3Code#UndertakingAmountChange
 * UndertakingStatus3Code.UndertakingAmountChange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode
 * UndertakingStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACCP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UndertakingStatus3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the undertaking status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UndertakingStatus3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingStatus3Code
	 * UndertakingStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * </ul>
	 */
	public static final UndertakingStatus3Code Accepted = new UndertakingStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			owner_lazy = () -> com.tools20022.repository.codeset.UndertakingStatus3Code.mmObject();
			codeName = UndertakingStatusCode.Accepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingStatus3Code
	 * UndertakingStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonConfirmation"</li>
	 * </ul>
	 */
	public static final UndertakingStatus3Code NonConfirmation = new UndertakingStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonConfirmation";
			owner_lazy = () -> com.tools20022.repository.codeset.UndertakingStatus3Code.mmObject();
			codeName = UndertakingStatusCode.NonConfirmation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingStatus3Code
	 * UndertakingStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * </ul>
	 */
	public static final UndertakingStatus3Code Rejected = new UndertakingStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.UndertakingStatus3Code.mmObject();
			codeName = UndertakingStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingStatus3Code
	 * UndertakingStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawn"</li>
	 * </ul>
	 */
	public static final UndertakingStatus3Code Withdrawn = new UndertakingStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawn";
			owner_lazy = () -> com.tools20022.repository.codeset.UndertakingStatus3Code.mmObject();
			codeName = UndertakingStatusCode.Withdrawn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingStatus3Code
	 * UndertakingStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterUndertakingAmountChange"</li>
	 * </ul>
	 */
	public static final UndertakingStatus3Code CounterUndertakingAmountChange = new UndertakingStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterUndertakingAmountChange";
			owner_lazy = () -> com.tools20022.repository.codeset.UndertakingStatus3Code.mmObject();
			codeName = UndertakingStatusCode.CounterUndertakingAmountChange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingStatus3Code
	 * UndertakingStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingAmountChange"</li>
	 * </ul>
	 */
	public static final UndertakingStatus3Code UndertakingAmountChange = new UndertakingStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingAmountChange";
			owner_lazy = () -> com.tools20022.repository.codeset.UndertakingStatus3Code.mmObject();
			codeName = UndertakingStatusCode.UndertakingAmountChange.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UndertakingStatus3Code> codesByName = new LinkedHashMap<>();

	protected UndertakingStatus3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACCP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingStatus3Code";
				definition = "Specifies the undertaking status.";
				trace_lazy = () -> UndertakingStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UndertakingStatus3Code.Accepted, com.tools20022.repository.codeset.UndertakingStatus3Code.NonConfirmation,
						com.tools20022.repository.codeset.UndertakingStatus3Code.Rejected, com.tools20022.repository.codeset.UndertakingStatus3Code.Withdrawn,
						com.tools20022.repository.codeset.UndertakingStatus3Code.CounterUndertakingAmountChange, com.tools20022.repository.codeset.UndertakingStatus3Code.UndertakingAmountChange);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(NonConfirmation.getCodeName().get(), NonConfirmation);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Withdrawn.getCodeName().get(), Withdrawn);
		codesByName.put(CounterUndertakingAmountChange.getCodeName().get(), CounterUndertakingAmountChange);
		codesByName.put(UndertakingAmountChange.getCodeName().get(), UndertakingAmountChange);
	}

	public static UndertakingStatus3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UndertakingStatus3Code[] values() {
		UndertakingStatus3Code[] values = new UndertakingStatus3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UndertakingStatus3Code> {
		@Override
		public UndertakingStatus3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UndertakingStatus3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}