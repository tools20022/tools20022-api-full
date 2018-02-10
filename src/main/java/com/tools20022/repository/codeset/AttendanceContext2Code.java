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
import com.tools20022.repository.codeset.AttendanceContext2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identify the method of delivery or distribution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContext2Code#AttendantDelivery
 * AttendanceContext2Code.AttendantDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContext2Code#CarrierDelivery
 * AttendanceContext2Code.CarrierDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContext2Code#CustomerDelivery
 * AttendanceContext2Code.CustomerDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContext2Code#FullServe
 * AttendanceContext2Code.FullServe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContext2Code#SelfServe
 * AttendanceContext2Code.SelfServe}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode
 * AttendanceContextCode}</li>
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
 * "AttendanceContext2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identify the method of delivery or distribution."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AttendanceContext2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContext2Code
	 * AttendanceContext2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendantDelivery"</li>
	 * </ul>
	 */
	public static final AttendanceContext2Code AttendantDelivery = new AttendanceContext2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendantDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.AttendanceContext2Code.mmObject();
			codeName = AttendanceContextCode.AttendantDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContext2Code
	 * AttendanceContext2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CarrierDelivery"</li>
	 * </ul>
	 */
	public static final AttendanceContext2Code CarrierDelivery = new AttendanceContext2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CarrierDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.AttendanceContext2Code.mmObject();
			codeName = AttendanceContextCode.CarrierDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContext2Code
	 * AttendanceContext2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerDelivery"</li>
	 * </ul>
	 */
	public static final AttendanceContext2Code CustomerDelivery = new AttendanceContext2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.AttendanceContext2Code.mmObject();
			codeName = AttendanceContextCode.CustomerDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContext2Code
	 * AttendanceContext2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullServe"</li>
	 * </ul>
	 */
	public static final AttendanceContext2Code FullServe = new AttendanceContext2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullServe";
			owner_lazy = () -> com.tools20022.repository.codeset.AttendanceContext2Code.mmObject();
			codeName = AttendanceContextCode.FullServe.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContext2Code
	 * AttendanceContext2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfServe"</li>
	 * </ul>
	 */
	public static final AttendanceContext2Code SelfServe = new AttendanceContext2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfServe";
			owner_lazy = () -> com.tools20022.repository.codeset.AttendanceContext2Code.mmObject();
			codeName = AttendanceContextCode.SelfServe.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AttendanceContext2Code> codesByName = new LinkedHashMap<>();

	protected AttendanceContext2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AttendanceContext2Code";
				definition = "Identify the method of delivery or distribution.";
				trace_lazy = () -> AttendanceContextCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AttendanceContext2Code.AttendantDelivery, com.tools20022.repository.codeset.AttendanceContext2Code.CarrierDelivery,
						com.tools20022.repository.codeset.AttendanceContext2Code.CustomerDelivery, com.tools20022.repository.codeset.AttendanceContext2Code.FullServe, com.tools20022.repository.codeset.AttendanceContext2Code.SelfServe);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AttendantDelivery.getCodeName().get(), AttendantDelivery);
		codesByName.put(CarrierDelivery.getCodeName().get(), CarrierDelivery);
		codesByName.put(CustomerDelivery.getCodeName().get(), CustomerDelivery);
		codesByName.put(FullServe.getCodeName().get(), FullServe);
		codesByName.put(SelfServe.getCodeName().get(), SelfServe);
	}

	public static AttendanceContext2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AttendanceContext2Code[] values() {
		AttendanceContext2Code[] values = new AttendanceContext2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AttendanceContext2Code> {
		@Override
		public AttendanceContext2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AttendanceContext2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}