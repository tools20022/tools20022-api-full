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
import com.tools20022.repository.codeset.CountrySubDivisionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Code to identify a name of a unit resulting from the division of a country,
 * dependency, or other area of special geopolitical interest contained in ISO
 * 3166-1, on the basis of country names obtained from the United Nations (ISO
 * 3166-2: Country subdivision code).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMString#getPattern pattern} =
 * "[A-Z]{2,2}\\-[0-9A-Z]{1,3}"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CountrySubDivisionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Code to identify a name of a unit resulting from the division of a country, dependency, or other area of special geopolitical interest contained in ISO 3166-1, on the basis of country names obtained from the United Nations (ISO 3166-2: Country subdivision code)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CountrySubDivisionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	final static private LinkedHashMap<String, CountrySubDivisionCode> codesByName = new LinkedHashMap<>();

	protected CountrySubDivisionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CountrySubDivisionCode";
				definition = "Code to identify a name of a unit resulting from the division of a country, dependency, or other area of special geopolitical interest contained in ISO 3166-1, on the basis of country names obtained from the United Nations (ISO 3166-2: Country subdivision code).";
				pattern = "[A-Z]{2,2}\\-[0-9A-Z]{1,3}";
			}
		});
		return mmObject_lazy.get();
	}

	static {
	}

	public static CountrySubDivisionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CountrySubDivisionCode[] values() {
		CountrySubDivisionCode[] values = new CountrySubDivisionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CountrySubDivisionCode> {
		@Override
		public CountrySubDivisionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CountrySubDivisionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}