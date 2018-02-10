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
import com.tools20022.repository.codeset.SafekeepingPlace2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of place of safekeeping.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlace2Code#SharesHeldElsewhere
 * SafekeepingPlace2Code.SharesHeldElsewhere}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlace2Code#AllPlaces
 * SafekeepingPlace2Code.AllPlaces}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlaceCode
 * SafekeepingPlaceCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SHHE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SafekeepingPlace2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of place of safekeeping."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SafekeepingPlace2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlace2Code
	 * SafekeepingPlace2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharesHeldElsewhere"</li>
	 * </ul>
	 */
	public static final SafekeepingPlace2Code SharesHeldElsewhere = new SafekeepingPlace2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharesHeldElsewhere";
			owner_lazy = () -> com.tools20022.repository.codeset.SafekeepingPlace2Code.mmObject();
			codeName = SafekeepingPlaceCode.SharesHeldElsewhere.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlace2Code
	 * SafekeepingPlace2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllPlaces"</li>
	 * </ul>
	 */
	public static final SafekeepingPlace2Code AllPlaces = new SafekeepingPlace2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllPlaces";
			owner_lazy = () -> com.tools20022.repository.codeset.SafekeepingPlace2Code.mmObject();
			codeName = SafekeepingPlaceCode.AllPlaces.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SafekeepingPlace2Code> codesByName = new LinkedHashMap<>();

	protected SafekeepingPlace2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SHHE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SafekeepingPlace2Code";
				definition = "Specifies the type of place of safekeeping.";
				trace_lazy = () -> SafekeepingPlaceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SafekeepingPlace2Code.SharesHeldElsewhere, com.tools20022.repository.codeset.SafekeepingPlace2Code.AllPlaces);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SharesHeldElsewhere.getCodeName().get(), SharesHeldElsewhere);
		codesByName.put(AllPlaces.getCodeName().get(), AllPlaces);
	}

	public static SafekeepingPlace2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SafekeepingPlace2Code[] values() {
		SafekeepingPlace2Code[] values = new SafekeepingPlace2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SafekeepingPlace2Code> {
		@Override
		public SafekeepingPlace2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SafekeepingPlace2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}