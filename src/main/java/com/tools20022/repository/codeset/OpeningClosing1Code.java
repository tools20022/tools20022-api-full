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
import com.tools20022.repository.codeset.OpeningClosing1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies additional information relative to the processing of the trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OpeningClosing1Code#ClosePosition
 * OpeningClosing1Code.ClosePosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OpeningClosing1Code#OpenPosition
 * OpeningClosing1Code.OpenPosition}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OpeningClosingCode
 * OpeningClosingCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CLOP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OpeningClosing1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies additional information relative to the processing of the trade."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OpeningClosing1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OpeningClosing1Code
	 * OpeningClosing1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosePosition"</li>
	 * </ul>
	 */
	public static final OpeningClosing1Code ClosePosition = new OpeningClosing1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosePosition";
			owner_lazy = () -> com.tools20022.repository.codeset.OpeningClosing1Code.mmObject();
			codeName = OpeningClosingCode.ClosePosition.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OpeningClosing1Code
	 * OpeningClosing1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenPosition"</li>
	 * </ul>
	 */
	public static final OpeningClosing1Code OpenPosition = new OpeningClosing1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenPosition";
			owner_lazy = () -> com.tools20022.repository.codeset.OpeningClosing1Code.mmObject();
			codeName = OpeningClosingCode.OpenPosition.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OpeningClosing1Code> codesByName = new LinkedHashMap<>();

	protected OpeningClosing1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CLOP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OpeningClosing1Code";
				definition = "Specifies additional information relative to the processing of the trade.";
				trace_lazy = () -> OpeningClosingCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OpeningClosing1Code.ClosePosition, com.tools20022.repository.codeset.OpeningClosing1Code.OpenPosition);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ClosePosition.getCodeName().get(), ClosePosition);
		codesByName.put(OpenPosition.getCodeName().get(), OpenPosition);
	}

	public static OpeningClosing1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OpeningClosing1Code[] values() {
		OpeningClosing1Code[] values = new OpeningClosing1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OpeningClosing1Code> {
		@Override
		public OpeningClosing1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OpeningClosing1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}