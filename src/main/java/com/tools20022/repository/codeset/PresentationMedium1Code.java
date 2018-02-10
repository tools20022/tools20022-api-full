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
import com.tools20022.repository.codeset.PresentationMedium1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the presentation medium.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PresentationMedium1Code#PaperElectronic
 * PresentationMedium1Code.PaperElectronic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PresentationMedium1Code#Electronic
 * PresentationMedium1Code.Electronic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PresentationMedium1Code#Paper
 * PresentationMedium1Code.Paper}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PresentationMediumCode
 * PresentationMediumCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BOTH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PresentationMedium1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the presentation medium."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PresentationMedium1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PresentationMedium1Code
	 * PresentationMedium1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaperElectronic"</li>
	 * </ul>
	 */
	public static final PresentationMedium1Code PaperElectronic = new PresentationMedium1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaperElectronic";
			owner_lazy = () -> com.tools20022.repository.codeset.PresentationMedium1Code.mmObject();
			codeName = PresentationMediumCode.PaperElectronic.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PresentationMedium1Code
	 * PresentationMedium1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Electronic"</li>
	 * </ul>
	 */
	public static final PresentationMedium1Code Electronic = new PresentationMedium1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Electronic";
			owner_lazy = () -> com.tools20022.repository.codeset.PresentationMedium1Code.mmObject();
			codeName = PresentationMediumCode.Electronic.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PresentationMedium1Code
	 * PresentationMedium1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Paper"</li>
	 * </ul>
	 */
	public static final PresentationMedium1Code Paper = new PresentationMedium1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Paper";
			owner_lazy = () -> com.tools20022.repository.codeset.PresentationMedium1Code.mmObject();
			codeName = PresentationMediumCode.Paper.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PresentationMedium1Code> codesByName = new LinkedHashMap<>();

	protected PresentationMedium1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BOTH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PresentationMedium1Code";
				definition = "Specifies the presentation medium.";
				trace_lazy = () -> PresentationMediumCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PresentationMedium1Code.PaperElectronic, com.tools20022.repository.codeset.PresentationMedium1Code.Electronic,
						com.tools20022.repository.codeset.PresentationMedium1Code.Paper);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PaperElectronic.getCodeName().get(), PaperElectronic);
		codesByName.put(Electronic.getCodeName().get(), Electronic);
		codesByName.put(Paper.getCodeName().get(), Paper);
	}

	public static PresentationMedium1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PresentationMedium1Code[] values() {
		PresentationMedium1Code[] values = new PresentationMedium1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PresentationMedium1Code> {
		@Override
		public PresentationMedium1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PresentationMedium1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}