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
import com.tools20022.repository.codeset.MarketIdentification1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of market identification code which is being defined.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketIdentification1Code#Segment
 * MarketIdentification1Code.Segment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketIdentification1Code#Operating
 * MarketIdentification1Code.Operating}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MarketIdentificationCode
 * MarketIdentificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarketIdentification1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of market identification code which is being defined."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MarketIdentification1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketIdentification1Code
	 * MarketIdentification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Segment"</li>
	 * </ul>
	 */
	public static final MarketIdentification1Code Segment = new MarketIdentification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Segment";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketIdentification1Code.mmObject();
			codeName = MarketIdentificationCode.Segment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketIdentification1Code
	 * MarketIdentification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Operating"</li>
	 * </ul>
	 */
	public static final MarketIdentification1Code Operating = new MarketIdentification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Operating";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketIdentification1Code.mmObject();
			codeName = MarketIdentificationCode.Operating.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MarketIdentification1Code> codesByName = new LinkedHashMap<>();

	protected MarketIdentification1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarketIdentification1Code";
				definition = "Specifies the type of market identification code which is being defined.";
				trace_lazy = () -> MarketIdentificationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MarketIdentification1Code.Segment, com.tools20022.repository.codeset.MarketIdentification1Code.Operating);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Segment.getCodeName().get(), Segment);
		codesByName.put(Operating.getCodeName().get(), Operating);
	}

	public static MarketIdentification1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MarketIdentification1Code[] values() {
		MarketIdentification1Code[] values = new MarketIdentification1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MarketIdentification1Code> {
		@Override
		public MarketIdentification1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MarketIdentification1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}