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
import com.tools20022.repository.codeset.CorporateActionMandatoryVoluntary1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the event is mandatory, mandatory with options or
 * voluntary.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionMandatoryVoluntary1Code#Mandatory
 * CorporateActionMandatoryVoluntary1Code.Mandatory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionMandatoryVoluntary1Code#MandatoryWithOptions
 * CorporateActionMandatoryVoluntary1Code.MandatoryWithOptions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionMandatoryVoluntary1Code#Voluntary
 * CorporateActionMandatoryVoluntary1Code.Voluntary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionMandatoryVoluntaryCode
 * CorporateActionMandatoryVoluntaryCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MAND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionMandatoryVoluntary1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the event is mandatory, mandatory with options or voluntary."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionMandatoryVoluntary1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionMandatoryVoluntary1Code
	 * CorporateActionMandatoryVoluntary1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandatory"</li>
	 * </ul>
	 */
	public static final CorporateActionMandatoryVoluntary1Code Mandatory = new CorporateActionMandatoryVoluntary1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mandatory";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionMandatoryVoluntary1Code.mmObject();
			codeName = CorporateActionMandatoryVoluntaryCode.Mandatory.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionMandatoryVoluntary1Code
	 * CorporateActionMandatoryVoluntary1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryWithOptions"</li>
	 * </ul>
	 */
	public static final CorporateActionMandatoryVoluntary1Code MandatoryWithOptions = new CorporateActionMandatoryVoluntary1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryWithOptions";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionMandatoryVoluntary1Code.mmObject();
			codeName = CorporateActionMandatoryVoluntaryCode.MandatoryWithOptions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionMandatoryVoluntary1Code
	 * CorporateActionMandatoryVoluntary1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Voluntary"</li>
	 * </ul>
	 */
	public static final CorporateActionMandatoryVoluntary1Code Voluntary = new CorporateActionMandatoryVoluntary1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Voluntary";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionMandatoryVoluntary1Code.mmObject();
			codeName = CorporateActionMandatoryVoluntaryCode.Voluntary.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionMandatoryVoluntary1Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionMandatoryVoluntary1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MAND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionMandatoryVoluntary1Code";
				definition = "Specifies whether the event is mandatory, mandatory with options or voluntary.";
				trace_lazy = () -> CorporateActionMandatoryVoluntaryCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionMandatoryVoluntary1Code.Mandatory, com.tools20022.repository.codeset.CorporateActionMandatoryVoluntary1Code.MandatoryWithOptions,
						com.tools20022.repository.codeset.CorporateActionMandatoryVoluntary1Code.Voluntary);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Mandatory.getCodeName().get(), Mandatory);
		codesByName.put(MandatoryWithOptions.getCodeName().get(), MandatoryWithOptions);
		codesByName.put(Voluntary.getCodeName().get(), Voluntary);
	}

	public static CorporateActionMandatoryVoluntary1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionMandatoryVoluntary1Code[] values() {
		CorporateActionMandatoryVoluntary1Code[] values = new CorporateActionMandatoryVoluntary1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionMandatoryVoluntary1Code> {
		@Override
		public CorporateActionMandatoryVoluntary1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionMandatoryVoluntary1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}