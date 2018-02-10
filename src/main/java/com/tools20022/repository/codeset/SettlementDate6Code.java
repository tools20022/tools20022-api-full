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
import com.tools20022.repository.codeset.SettlementDate6Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the time an event occurred relative to an implied date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate6Code#TPlusFive
 * SettlementDate6Code.TPlusFive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate6Code#TPlusFour
 * SettlementDate6Code.TPlusFour}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate6Code#TPlusOne
 * SettlementDate6Code.TPlusOne}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate6Code#TPlusThree
 * SettlementDate6Code.TPlusThree}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate6Code#TPlusTwo
 * SettlementDate6Code.TPlusTwo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate6Code#SameDay
 * SettlementDate6Code.SameDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate6Code#PreviousDay
 * SettlementDate6Code.PreviousDay}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
 * SettlementDateCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementDate6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the time an event occurred relative to an implied date."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementDate6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate6Code
	 * SettlementDate6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TPlusFive"</li>
	 * </ul>
	 */
	public static final SettlementDate6Code TPlusFive = new SettlementDate6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TPlusFive";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate6Code.mmObject();
			codeName = SettlementDateCode.TPlusFive.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate6Code
	 * SettlementDate6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TPlusFour"</li>
	 * </ul>
	 */
	public static final SettlementDate6Code TPlusFour = new SettlementDate6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TPlusFour";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate6Code.mmObject();
			codeName = SettlementDateCode.TPlusFour.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate6Code
	 * SettlementDate6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TPlusOne"</li>
	 * </ul>
	 */
	public static final SettlementDate6Code TPlusOne = new SettlementDate6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TPlusOne";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate6Code.mmObject();
			codeName = SettlementDateCode.TPlusOne.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate6Code
	 * SettlementDate6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TPlusThree"</li>
	 * </ul>
	 */
	public static final SettlementDate6Code TPlusThree = new SettlementDate6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TPlusThree";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate6Code.mmObject();
			codeName = SettlementDateCode.TPlusThree.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate6Code
	 * SettlementDate6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TPlusTwo"</li>
	 * </ul>
	 */
	public static final SettlementDate6Code TPlusTwo = new SettlementDate6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TPlusTwo";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate6Code.mmObject();
			codeName = SettlementDateCode.TPlusTwo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate6Code
	 * SettlementDate6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SameDay"</li>
	 * </ul>
	 */
	public static final SettlementDate6Code SameDay = new SettlementDate6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameDay";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate6Code.mmObject();
			codeName = SettlementDateCode.SameDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate6Code
	 * SettlementDate6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousDay"</li>
	 * </ul>
	 */
	public static final SettlementDate6Code PreviousDay = new SettlementDate6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousDay";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate6Code.mmObject();
			codeName = SettlementDateCode.PreviousDay.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettlementDate6Code> codesByName = new LinkedHashMap<>();

	protected SettlementDate6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SettlementDate6Code";
				definition = "Specifies the time an event occurred relative to an implied date.";
				trace_lazy = () -> SettlementDateCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementDate6Code.TPlusFive, com.tools20022.repository.codeset.SettlementDate6Code.TPlusFour,
						com.tools20022.repository.codeset.SettlementDate6Code.TPlusOne, com.tools20022.repository.codeset.SettlementDate6Code.TPlusThree, com.tools20022.repository.codeset.SettlementDate6Code.TPlusTwo,
						com.tools20022.repository.codeset.SettlementDate6Code.SameDay, com.tools20022.repository.codeset.SettlementDate6Code.PreviousDay);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(TPlusFive.getCodeName().get(), TPlusFive);
		codesByName.put(TPlusFour.getCodeName().get(), TPlusFour);
		codesByName.put(TPlusOne.getCodeName().get(), TPlusOne);
		codesByName.put(TPlusThree.getCodeName().get(), TPlusThree);
		codesByName.put(TPlusTwo.getCodeName().get(), TPlusTwo);
		codesByName.put(SameDay.getCodeName().get(), SameDay);
		codesByName.put(PreviousDay.getCodeName().get(), PreviousDay);
	}

	public static SettlementDate6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementDate6Code[] values() {
		SettlementDate6Code[] values = new SettlementDate6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementDate6Code> {
		@Override
		public SettlementDate6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementDate6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}