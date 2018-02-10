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
import com.tools20022.repository.codeset.StampDutyType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if the stamp duty is applicable.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StampDutyType1Code#OutsideCSD
 * StampDutyType1Code.OutsideCSD}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.StampDutyType1Code#Paid
 * StampDutyType1Code.Paid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StampDutyType1Code#NotApplicable
 * StampDutyType1Code.NotApplicable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StampDutyType1Code#Exemption
 * StampDutyType1Code.Exemption}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.StampDutyTypeCode
 * StampDutyTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SDRU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StampDutyType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies if the stamp duty is applicable."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class StampDutyType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StampDutyType1Code
	 * StampDutyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutsideCSD"</li>
	 * </ul>
	 */
	public static final StampDutyType1Code OutsideCSD = new StampDutyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutsideCSD";
			owner_lazy = () -> com.tools20022.repository.codeset.StampDutyType1Code.mmObject();
			codeName = StampDutyTypeCode.OutsideCSD.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StampDutyType1Code
	 * StampDutyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Paid"</li>
	 * </ul>
	 */
	public static final StampDutyType1Code Paid = new StampDutyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Paid";
			owner_lazy = () -> com.tools20022.repository.codeset.StampDutyType1Code.mmObject();
			codeName = StampDutyTypeCode.Paid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StampDutyType1Code
	 * StampDutyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotApplicable"</li>
	 * </ul>
	 */
	public static final StampDutyType1Code NotApplicable = new StampDutyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotApplicable";
			owner_lazy = () -> com.tools20022.repository.codeset.StampDutyType1Code.mmObject();
			codeName = StampDutyTypeCode.NotApplicable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StampDutyType1Code
	 * StampDutyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exemption"</li>
	 * </ul>
	 */
	public static final StampDutyType1Code Exemption = new StampDutyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exemption";
			owner_lazy = () -> com.tools20022.repository.codeset.StampDutyType1Code.mmObject();
			codeName = StampDutyTypeCode.Exemption.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, StampDutyType1Code> codesByName = new LinkedHashMap<>();

	protected StampDutyType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SDRU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StampDutyType1Code";
				definition = "Specifies if the stamp duty is applicable.";
				trace_lazy = () -> StampDutyTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StampDutyType1Code.OutsideCSD, com.tools20022.repository.codeset.StampDutyType1Code.Paid, com.tools20022.repository.codeset.StampDutyType1Code.NotApplicable,
						com.tools20022.repository.codeset.StampDutyType1Code.Exemption);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OutsideCSD.getCodeName().get(), OutsideCSD);
		codesByName.put(Paid.getCodeName().get(), Paid);
		codesByName.put(NotApplicable.getCodeName().get(), NotApplicable);
		codesByName.put(Exemption.getCodeName().get(), Exemption);
	}

	public static StampDutyType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static StampDutyType1Code[] values() {
		StampDutyType1Code[] values = new StampDutyType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, StampDutyType1Code> {
		@Override
		public StampDutyType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(StampDutyType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}