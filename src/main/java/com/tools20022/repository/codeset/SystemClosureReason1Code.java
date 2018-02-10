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
import com.tools20022.repository.codeset.SystemClosureReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for system inactivity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemClosureReason1Code#BankingHoliday
 * SystemClosureReason1Code.BankingHoliday}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemClosureReason1Code#SystemMaintenance
 * SystemClosureReason1Code.SystemMaintenance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemClosureReason1Code#NoOperation
 * SystemClosureReason1Code.NoOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemClosureReason1Code#Recovery
 * SystemClosureReason1Code.Recovery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemClosureReason1Code#AllowedDowntimeWindow
 * SystemClosureReason1Code.AllowedDowntimeWindow}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SystemClosureReasonCode
 * SystemClosureReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BHOL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemClosureReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for system inactivity."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SystemClosureReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemClosureReason1Code
	 * SystemClosureReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankingHoliday"</li>
	 * </ul>
	 */
	public static final SystemClosureReason1Code BankingHoliday = new SystemClosureReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankingHoliday";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemClosureReason1Code.mmObject();
			codeName = SystemClosureReasonCode.BankingHoliday.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemClosureReason1Code
	 * SystemClosureReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemMaintenance"</li>
	 * </ul>
	 */
	public static final SystemClosureReason1Code SystemMaintenance = new SystemClosureReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemMaintenance";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemClosureReason1Code.mmObject();
			codeName = SystemClosureReasonCode.SystemMaintenance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemClosureReason1Code
	 * SystemClosureReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoOperation"</li>
	 * </ul>
	 */
	public static final SystemClosureReason1Code NoOperation = new SystemClosureReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoOperation";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemClosureReason1Code.mmObject();
			codeName = SystemClosureReasonCode.NoOperation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemClosureReason1Code
	 * SystemClosureReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Recovery"</li>
	 * </ul>
	 */
	public static final SystemClosureReason1Code Recovery = new SystemClosureReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recovery";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemClosureReason1Code.mmObject();
			codeName = SystemClosureReasonCode.Recovery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemClosureReason1Code
	 * SystemClosureReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowedDowntimeWindow"</li>
	 * </ul>
	 */
	public static final SystemClosureReason1Code AllowedDowntimeWindow = new SystemClosureReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllowedDowntimeWindow";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemClosureReason1Code.mmObject();
			codeName = SystemClosureReasonCode.AllowedDowntimeWindow.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SystemClosureReason1Code> codesByName = new LinkedHashMap<>();

	protected SystemClosureReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BHOL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemClosureReason1Code";
				definition = "Specifies the reason for system inactivity.";
				trace_lazy = () -> SystemClosureReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SystemClosureReason1Code.BankingHoliday, com.tools20022.repository.codeset.SystemClosureReason1Code.SystemMaintenance,
						com.tools20022.repository.codeset.SystemClosureReason1Code.NoOperation, com.tools20022.repository.codeset.SystemClosureReason1Code.Recovery,
						com.tools20022.repository.codeset.SystemClosureReason1Code.AllowedDowntimeWindow);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BankingHoliday.getCodeName().get(), BankingHoliday);
		codesByName.put(SystemMaintenance.getCodeName().get(), SystemMaintenance);
		codesByName.put(NoOperation.getCodeName().get(), NoOperation);
		codesByName.put(Recovery.getCodeName().get(), Recovery);
		codesByName.put(AllowedDowntimeWindow.getCodeName().get(), AllowedDowntimeWindow);
	}

	public static SystemClosureReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SystemClosureReason1Code[] values() {
		SystemClosureReason1Code[] values = new SystemClosureReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SystemClosureReason1Code> {
		@Override
		public SystemClosureReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SystemClosureReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}