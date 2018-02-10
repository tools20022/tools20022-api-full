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
import com.tools20022.repository.codeset.TimeOutCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for time-out.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TimeOutCode#LatestShipmentDateDue
 * TimeOutCode.LatestShipmentDateDue}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeOutCode#NoAction
 * TimeOutCode.NoAction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeOut1Code TimeOut1Code}</li>
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
 * <li>"LSDD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TimeOutCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for time-out."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TimeOutCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reason for time-out is the reaching of latest shipment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TimeOutCode TimeOutCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LSDD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LatestShipmentDateDue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for time-out is the reaching of latest shipment date."</li>
	 * </ul>
	 */
	public static final TimeOutCode LatestShipmentDateDue = new TimeOutCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LatestShipmentDateDue";
			definition = "Reason for time-out is the reaching of latest shipment date.";
			owner_lazy = () -> com.tools20022.repository.codeset.TimeOutCode.mmObject();
			codeName = "LSDD";
		}
	};
	/**
	 * Reason for time-out is the lack of action from the user side.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TimeOutCode TimeOutCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NACT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for time-out is the lack of action from the user side."</li>
	 * </ul>
	 */
	public static final TimeOutCode NoAction = new TimeOutCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAction";
			definition = "Reason for time-out is the lack of action from the user side.";
			owner_lazy = () -> com.tools20022.repository.codeset.TimeOutCode.mmObject();
			codeName = "NACT";
		}
	};
	final static private LinkedHashMap<String, TimeOutCode> codesByName = new LinkedHashMap<>();

	protected TimeOutCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("LSDD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TimeOutCode";
				definition = "Specifies the reason for time-out.";
				derivation_lazy = () -> Arrays.asList(TimeOut1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TimeOutCode.LatestShipmentDateDue, com.tools20022.repository.codeset.TimeOutCode.NoAction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(LatestShipmentDateDue.getCodeName().get(), LatestShipmentDateDue);
		codesByName.put(NoAction.getCodeName().get(), NoAction);
	}

	public static TimeOutCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TimeOutCode[] values() {
		TimeOutCode[] values = new TimeOutCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TimeOutCode> {
		@Override
		public TimeOutCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TimeOutCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}