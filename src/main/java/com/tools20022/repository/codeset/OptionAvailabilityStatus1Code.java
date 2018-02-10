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
import com.tools20022.repository.codeset.OptionAvailabilityStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of the option availability.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionAvailabilityStatus1Code#Inactive
 * OptionAvailabilityStatus1Code.Inactive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionAvailabilityStatus1Code#Cancelled
 * OptionAvailabilityStatus1Code.Cancelled}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OptionAvailabilityStatusCode
 * OptionAvailabilityStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"INTV"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OptionAvailabilityStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of the option availability."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OptionAvailabilityStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionAvailabilityStatus1Code
	 * OptionAvailabilityStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Inactive"</li>
	 * </ul>
	 */
	public static final OptionAvailabilityStatus1Code Inactive = new OptionAvailabilityStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Inactive";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionAvailabilityStatus1Code.mmObject();
			codeName = OptionAvailabilityStatusCode.Inactive.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionAvailabilityStatus1Code
	 * OptionAvailabilityStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * </ul>
	 */
	public static final OptionAvailabilityStatus1Code Cancelled = new OptionAvailabilityStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionAvailabilityStatus1Code.mmObject();
			codeName = OptionAvailabilityStatusCode.Cancelled.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OptionAvailabilityStatus1Code> codesByName = new LinkedHashMap<>();

	protected OptionAvailabilityStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INTV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OptionAvailabilityStatus1Code";
				definition = "Specifies the status of the option availability.";
				trace_lazy = () -> OptionAvailabilityStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OptionAvailabilityStatus1Code.Inactive, com.tools20022.repository.codeset.OptionAvailabilityStatus1Code.Cancelled);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Inactive.getCodeName().get(), Inactive);
		codesByName.put(Cancelled.getCodeName().get(), Cancelled);
	}

	public static OptionAvailabilityStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OptionAvailabilityStatus1Code[] values() {
		OptionAvailabilityStatus1Code[] values = new OptionAvailabilityStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OptionAvailabilityStatus1Code> {
		@Override
		public OptionAvailabilityStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OptionAvailabilityStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}