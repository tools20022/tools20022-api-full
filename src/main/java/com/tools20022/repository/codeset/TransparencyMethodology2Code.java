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
import com.tools20022.repository.codeset.TransparencyMethodology2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the methodology used for a transparency operation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransparencyMethodology2Code#Year
 * TransparencyMethodology2Code.Year}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransparencyMethodology2Code#SystematicInternaliser
 * TransparencyMethodology2Code.SystematicInternaliser}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransparencyMethodology2Code#FirstFourWeeks
 * TransparencyMethodology2Code.FirstFourWeeks}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransparencyMethodology2Code#Estimated
 * TransparencyMethodology2Code.Estimated}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TransparencyMethodologyCode
 * TransparencyMethodologyCode}</li>
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
 * "TransparencyMethodology2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the methodology used for a transparency operation."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransparencyMethodology2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransparencyMethodology2Code
	 * TransparencyMethodology2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Year"</li>
	 * </ul>
	 */
	public static final TransparencyMethodology2Code Year = new TransparencyMethodology2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Year";
			owner_lazy = () -> com.tools20022.repository.codeset.TransparencyMethodology2Code.mmObject();
			codeName = TransparencyMethodologyCode.Year.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransparencyMethodology2Code
	 * TransparencyMethodology2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystematicInternaliser"</li>
	 * </ul>
	 */
	public static final TransparencyMethodology2Code SystematicInternaliser = new TransparencyMethodology2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystematicInternaliser";
			owner_lazy = () -> com.tools20022.repository.codeset.TransparencyMethodology2Code.mmObject();
			codeName = TransparencyMethodologyCode.SystematicInternaliser.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransparencyMethodology2Code
	 * TransparencyMethodology2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstFourWeeks"</li>
	 * </ul>
	 */
	public static final TransparencyMethodology2Code FirstFourWeeks = new TransparencyMethodology2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstFourWeeks";
			owner_lazy = () -> com.tools20022.repository.codeset.TransparencyMethodology2Code.mmObject();
			codeName = TransparencyMethodologyCode.FirstFourWeeks.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransparencyMethodology2Code
	 * TransparencyMethodology2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Estimated"</li>
	 * </ul>
	 */
	public static final TransparencyMethodology2Code Estimated = new TransparencyMethodology2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Estimated";
			owner_lazy = () -> com.tools20022.repository.codeset.TransparencyMethodology2Code.mmObject();
			codeName = TransparencyMethodologyCode.Estimated.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TransparencyMethodology2Code> codesByName = new LinkedHashMap<>();

	protected TransparencyMethodology2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransparencyMethodology2Code";
				definition = "Specifies the methodology used for a transparency operation.";
				trace_lazy = () -> TransparencyMethodologyCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransparencyMethodology2Code.Year, com.tools20022.repository.codeset.TransparencyMethodology2Code.SystematicInternaliser,
						com.tools20022.repository.codeset.TransparencyMethodology2Code.FirstFourWeeks, com.tools20022.repository.codeset.TransparencyMethodology2Code.Estimated);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Year.getCodeName().get(), Year);
		codesByName.put(SystematicInternaliser.getCodeName().get(), SystematicInternaliser);
		codesByName.put(FirstFourWeeks.getCodeName().get(), FirstFourWeeks);
		codesByName.put(Estimated.getCodeName().get(), Estimated);
	}

	public static TransparencyMethodology2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransparencyMethodology2Code[] values() {
		TransparencyMethodology2Code[] values = new TransparencyMethodology2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransparencyMethodology2Code> {
		@Override
		public TransparencyMethodology2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransparencyMethodology2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}