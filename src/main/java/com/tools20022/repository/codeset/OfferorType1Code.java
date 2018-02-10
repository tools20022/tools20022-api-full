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
import com.tools20022.repository.codeset.OfferorType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the offeror for the event is the issuing company or a third
 * party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OfferorType1Code#Self
 * OfferorType1Code.Self}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferorType1Code#ThirdParty
 * OfferorType1Code.ThirdParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OfferorTypeCode
 * OfferorTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SELF"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OfferorType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the offeror for the event is the issuing company or a third party."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OfferorType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferorType1Code
	 * OfferorType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Self"</li>
	 * </ul>
	 */
	public static final OfferorType1Code Self = new OfferorType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Self";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferorType1Code.mmObject();
			codeName = OfferorTypeCode.Self.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferorType1Code
	 * OfferorType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdParty"</li>
	 * </ul>
	 */
	public static final OfferorType1Code ThirdParty = new OfferorType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdParty";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferorType1Code.mmObject();
			codeName = OfferorTypeCode.ThirdParty.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OfferorType1Code> codesByName = new LinkedHashMap<>();

	protected OfferorType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SELF");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OfferorType1Code";
				definition = "Specifies whether the offeror for the event is the issuing company or a third party.";
				trace_lazy = () -> OfferorTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OfferorType1Code.Self, com.tools20022.repository.codeset.OfferorType1Code.ThirdParty);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Self.getCodeName().get(), Self);
		codesByName.put(ThirdParty.getCodeName().get(), ThirdParty);
	}

	public static OfferorType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OfferorType1Code[] values() {
		OfferorType1Code[] values = new OfferorType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OfferorType1Code> {
		@Override
		public OfferorType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OfferorType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}