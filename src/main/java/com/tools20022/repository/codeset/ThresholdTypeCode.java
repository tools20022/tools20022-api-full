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
import com.tools20022.repository.codeset.ThresholdTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines whether the threshold was applied on an unsecured or securited basis.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ThresholdTypeCode#Secured
 * ThresholdTypeCode.Secured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ThresholdTypeCode#Unsecured
 * ThresholdTypeCode.Unsecured}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ThresholdType1Code
 * ThresholdType1Code}</li>
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
 * <li>"SECU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ThresholdTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines whether the threshold was applied on an unsecured or securited basis."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ThresholdTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Means that once the threshold is breached, collateral must be posted to
	 * cover the full exposure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ThresholdTypeCode
	 * ThresholdTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Secured"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Means that once the threshold is breached, collateral must be posted to cover the full exposure."
	 * </li>
	 * </ul>
	 */
	public static final ThresholdTypeCode Secured = new ThresholdTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Secured";
			definition = "Means that once the threshold is breached, collateral must be posted to cover the full exposure.";
			owner_lazy = () -> com.tools20022.repository.codeset.ThresholdTypeCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Means that the threshold provides a predetermined level of free trading.
	 * Once the threshold is breached, collateral must be posted to cover the
	 * exposure over and above the threshold level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ThresholdTypeCode
	 * ThresholdTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unsecured"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Means that the threshold provides a predetermined level of free trading. Once the threshold is breached, collateral must be posted to cover the exposure over and above the threshold level."
	 * </li>
	 * </ul>
	 */
	public static final ThresholdTypeCode Unsecured = new ThresholdTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unsecured";
			definition = "Means that the threshold provides a predetermined level of free trading. Once the threshold is breached, collateral must be posted to cover the exposure over and above the threshold level.";
			owner_lazy = () -> com.tools20022.repository.codeset.ThresholdTypeCode.mmObject();
			codeName = "UNSE";
		}
	};
	final static private LinkedHashMap<String, ThresholdTypeCode> codesByName = new LinkedHashMap<>();

	protected ThresholdTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SECU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ThresholdTypeCode";
				definition = "Defines whether the threshold was applied on an unsecured or securited basis.";
				derivation_lazy = () -> Arrays.asList(ThresholdType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ThresholdTypeCode.Secured, com.tools20022.repository.codeset.ThresholdTypeCode.Unsecured);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Secured.getCodeName().get(), Secured);
		codesByName.put(Unsecured.getCodeName().get(), Unsecured);
	}

	public static ThresholdTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ThresholdTypeCode[] values() {
		ThresholdTypeCode[] values = new ThresholdTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ThresholdTypeCode> {
		@Override
		public ThresholdTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ThresholdTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}