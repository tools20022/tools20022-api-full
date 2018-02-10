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
import com.tools20022.repository.codeset.NonEligibleProceedsIndicator1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies information regarding the non eligibility of the outturn resources.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonEligibleProceedsIndicator1Code#NonEligibleCurrency
 * NonEligibleProceedsIndicator1Code.NonEligibleCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonEligibleProceedsIndicator1Code#AccountLimitation
 * NonEligibleProceedsIndicator1Code.AccountLimitation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonEligibleProceedsIndicator1Code#OtherNonEligibility
 * NonEligibleProceedsIndicator1Code.OtherNonEligibility}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode
 * NonEligibleProceedsIndicatorCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NELC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NonEligibleProceedsIndicator1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies information regarding the non eligibility of the outturn resources."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NonEligibleProceedsIndicator1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonEligibleProceedsIndicator1Code
	 * NonEligibleProceedsIndicator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonEligibleCurrency"</li>
	 * </ul>
	 */
	public static final NonEligibleProceedsIndicator1Code NonEligibleCurrency = new NonEligibleProceedsIndicator1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonEligibleCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.NonEligibleProceedsIndicator1Code.mmObject();
			codeName = NonEligibleProceedsIndicatorCode.NonEligibleCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonEligibleProceedsIndicator1Code
	 * NonEligibleProceedsIndicator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountLimitation"</li>
	 * </ul>
	 */
	public static final NonEligibleProceedsIndicator1Code AccountLimitation = new NonEligibleProceedsIndicator1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountLimitation";
			owner_lazy = () -> com.tools20022.repository.codeset.NonEligibleProceedsIndicator1Code.mmObject();
			codeName = NonEligibleProceedsIndicatorCode.AccountLimitation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonEligibleProceedsIndicator1Code
	 * NonEligibleProceedsIndicator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherNonEligibility"</li>
	 * </ul>
	 */
	public static final NonEligibleProceedsIndicator1Code OtherNonEligibility = new NonEligibleProceedsIndicator1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherNonEligibility";
			owner_lazy = () -> com.tools20022.repository.codeset.NonEligibleProceedsIndicator1Code.mmObject();
			codeName = NonEligibleProceedsIndicatorCode.OtherNonEligibility.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, NonEligibleProceedsIndicator1Code> codesByName = new LinkedHashMap<>();

	protected NonEligibleProceedsIndicator1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NELC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NonEligibleProceedsIndicator1Code";
				definition = "Specifies information regarding the non eligibility of the outturn resources.";
				trace_lazy = () -> NonEligibleProceedsIndicatorCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NonEligibleProceedsIndicator1Code.NonEligibleCurrency, com.tools20022.repository.codeset.NonEligibleProceedsIndicator1Code.AccountLimitation,
						com.tools20022.repository.codeset.NonEligibleProceedsIndicator1Code.OtherNonEligibility);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NonEligibleCurrency.getCodeName().get(), NonEligibleCurrency);
		codesByName.put(AccountLimitation.getCodeName().get(), AccountLimitation);
		codesByName.put(OtherNonEligibility.getCodeName().get(), OtherNonEligibility);
	}

	public static NonEligibleProceedsIndicator1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NonEligibleProceedsIndicator1Code[] values() {
		NonEligibleProceedsIndicator1Code[] values = new NonEligibleProceedsIndicator1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NonEligibleProceedsIndicator1Code> {
		@Override
		public NonEligibleProceedsIndicator1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NonEligibleProceedsIndicator1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}