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
import com.tools20022.repository.codeset.ElectionMovementType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the effect on the holdings of electing a Corporate Action option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ElectionMovementType2Code#Direct
 * ElectionMovementType2Code.Direct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ElectionMovementType2Code#Sequestered
 * ElectionMovementType2Code.Sequestered}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ElectionMovementTypeCode
 * ElectionMovementTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DRCT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ElectionMovementType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the effect on the holdings of electing a Corporate Action option."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ElectionMovementType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ElectionMovementType2Code
	 * ElectionMovementType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Direct"</li>
	 * </ul>
	 */
	public static final ElectionMovementType2Code Direct = new ElectionMovementType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Direct";
			owner_lazy = () -> com.tools20022.repository.codeset.ElectionMovementType2Code.mmObject();
			codeName = ElectionMovementTypeCode.Direct.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ElectionMovementType2Code
	 * ElectionMovementType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sequestered"</li>
	 * </ul>
	 */
	public static final ElectionMovementType2Code Sequestered = new ElectionMovementType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sequestered";
			owner_lazy = () -> com.tools20022.repository.codeset.ElectionMovementType2Code.mmObject();
			codeName = ElectionMovementTypeCode.Sequestered.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ElectionMovementType2Code> codesByName = new LinkedHashMap<>();

	protected ElectionMovementType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DRCT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ElectionMovementType2Code";
				definition = "Specifies the effect on the holdings of electing a Corporate Action option.";
				trace_lazy = () -> ElectionMovementTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ElectionMovementType2Code.Direct, com.tools20022.repository.codeset.ElectionMovementType2Code.Sequestered);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Direct.getCodeName().get(), Direct);
		codesByName.put(Sequestered.getCodeName().get(), Sequestered);
	}

	public static ElectionMovementType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ElectionMovementType2Code[] values() {
		ElectionMovementType2Code[] values = new ElectionMovementType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ElectionMovementType2Code> {
		@Override
		public ElectionMovementType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ElectionMovementType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}