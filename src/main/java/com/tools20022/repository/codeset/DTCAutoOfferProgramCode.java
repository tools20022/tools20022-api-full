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
import com.tools20022.repository.codeset.DTCAutoOfferProgramCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates what type of interface an agent has with DTC (The Depository Trust
 * Corporation).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAutoOfferProgramCode#Offine
 * DTCAutoOfferProgramCode.Offine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAutoOfferProgramCode#Online
 * DTCAutoOfferProgramCode.Online}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCAutoOfferProgram1Code
 * DTCAutoOfferProgram1Code}</li>
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
 * <li>"OFFL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCAutoOfferProgramCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates what type of interface an agent has with DTC (The Depository Trust Corporation)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCAutoOfferProgramCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * No automated interface. Hardcopy reporting required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAutoOfferProgramCode
	 * DTCAutoOfferProgramCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OFFL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No automated interface. Hardcopy reporting required."</li>
	 * </ul>
	 */
	public static final DTCAutoOfferProgramCode Offine = new DTCAutoOfferProgramCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Offine";
			definition = "No automated interface. Hardcopy reporting required.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAutoOfferProgramCode.mmObject();
			codeName = "OFFL";
		}
	};
	/**
	 * Automated interface for instruction processing is present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAutoOfferProgramCode
	 * DTCAutoOfferProgramCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONLN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Online"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Automated interface for instruction processing is present."</li>
	 * </ul>
	 */
	public static final DTCAutoOfferProgramCode Online = new DTCAutoOfferProgramCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Online";
			definition = "Automated interface for instruction processing is present.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAutoOfferProgramCode.mmObject();
			codeName = "ONLN";
		}
	};
	final static private LinkedHashMap<String, DTCAutoOfferProgramCode> codesByName = new LinkedHashMap<>();

	protected DTCAutoOfferProgramCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OFFL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCAutoOfferProgramCode";
				definition = "Indicates what type of interface an agent has with DTC (The Depository Trust Corporation).";
				derivation_lazy = () -> Arrays.asList(DTCAutoOfferProgram1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCAutoOfferProgramCode.Offine, com.tools20022.repository.codeset.DTCAutoOfferProgramCode.Online);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Offine.getCodeName().get(), Offine);
		codesByName.put(Online.getCodeName().get(), Online);
	}

	public static DTCAutoOfferProgramCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCAutoOfferProgramCode[] values() {
		DTCAutoOfferProgramCode[] values = new DTCAutoOfferProgramCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCAutoOfferProgramCode> {
		@Override
		public DTCAutoOfferProgramCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCAutoOfferProgramCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}