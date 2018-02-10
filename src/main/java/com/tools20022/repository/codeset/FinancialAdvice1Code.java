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
import com.tools20022.repository.codeset.FinancialAdvice1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if advice has been received from an independent financial advisor.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAdvice1Code#Received
 * FinancialAdvice1Code.Received}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAdvice1Code#NotReceived
 * FinancialAdvice1Code.NotReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAdvice1Code#Unknown
 * FinancialAdvice1Code.Unknown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FinancialAdviceCode
 * FinancialAdviceCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RECE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialAdvice1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if advice has been received from an independent financial advisor."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FinancialAdvice1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAdvice1Code
	 * FinancialAdvice1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * </ul>
	 */
	public static final FinancialAdvice1Code Received = new FinancialAdvice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAdvice1Code.mmObject();
			codeName = FinancialAdviceCode.Received.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAdvice1Code
	 * FinancialAdvice1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotReceived"</li>
	 * </ul>
	 */
	public static final FinancialAdvice1Code NotReceived = new FinancialAdvice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotReceived";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAdvice1Code.mmObject();
			codeName = FinancialAdviceCode.NotReceived.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAdvice1Code
	 * FinancialAdvice1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * </ul>
	 */
	public static final FinancialAdvice1Code Unknown = new FinancialAdvice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAdvice1Code.mmObject();
			codeName = FinancialAdviceCode.Unknown.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FinancialAdvice1Code> codesByName = new LinkedHashMap<>();

	protected FinancialAdvice1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RECE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialAdvice1Code";
				definition = "Specifies if advice has been received from an independent financial advisor.";
				trace_lazy = () -> FinancialAdviceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FinancialAdvice1Code.Received, com.tools20022.repository.codeset.FinancialAdvice1Code.NotReceived,
						com.tools20022.repository.codeset.FinancialAdvice1Code.Unknown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Received.getCodeName().get(), Received);
		codesByName.put(NotReceived.getCodeName().get(), NotReceived);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
	}

	public static FinancialAdvice1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FinancialAdvice1Code[] values() {
		FinancialAdvice1Code[] values = new FinancialAdvice1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FinancialAdvice1Code> {
		@Override
		public FinancialAdvice1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FinancialAdvice1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}