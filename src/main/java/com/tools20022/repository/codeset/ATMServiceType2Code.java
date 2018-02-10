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
import com.tools20022.repository.codeset.ATMServiceType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Describes the type of ATM transaction selected by the customer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType2Code#ChosenWithdrawal
 * ATMServiceType2Code.ChosenWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType2Code#PINChange
 * ATMServiceType2Code.PINChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType2Code#PINRecovery
 * ATMServiceType2Code.PINRecovery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType2Code#PINUnblock
 * ATMServiceType2Code.PINUnblock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType2Code#PreAuthorisedWithdrawal
 * ATMServiceType2Code.PreAuthorisedWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType2Code#ProfileWithdrawal
 * ATMServiceType2Code.ProfileWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType2Code#StandardWithdrawal
 * ATMServiceType2Code.StandardWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType2Code#SupervisedWithdrawal
 * ATMServiceType2Code.SupervisedWithdrawal}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
 * ATMServiceTypeCode}</li>
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
 * "ATMServiceType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the type of ATM transaction selected by the customer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMServiceType5Code
 * ATMServiceType5Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMServiceType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType2Code
	 * ATMServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChosenWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType2Code ChosenWithdrawal = new ATMServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChosenWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType2Code.mmObject();
			codeName = ATMServiceTypeCode.ChosenWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType2Code
	 * ATMServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINChange"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType5Code#PINChange
	 * ATMServiceType5Code.PINChange}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMServiceType2Code PINChange = new ATMServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINChange";
			nextVersions_lazy = () -> Arrays.asList(ATMServiceType5Code.PINChange);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType2Code.mmObject();
			codeName = ATMServiceTypeCode.PINChange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType2Code
	 * ATMServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINRecovery"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType5Code#PINRecovery
	 * ATMServiceType5Code.PINRecovery}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMServiceType2Code PINRecovery = new ATMServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINRecovery";
			nextVersions_lazy = () -> Arrays.asList(ATMServiceType5Code.PINRecovery);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType2Code.mmObject();
			codeName = ATMServiceTypeCode.PINRecovery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType2Code
	 * ATMServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINUnblock"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType5Code#PINUnblock
	 * ATMServiceType5Code.PINUnblock}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMServiceType2Code PINUnblock = new ATMServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINUnblock";
			nextVersions_lazy = () -> Arrays.asList(ATMServiceType5Code.PINUnblock);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType2Code.mmObject();
			codeName = ATMServiceTypeCode.PINUnblock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType2Code
	 * ATMServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAuthorisedWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType2Code PreAuthorisedWithdrawal = new ATMServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAuthorisedWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType2Code.mmObject();
			codeName = ATMServiceTypeCode.PreAuthorisedWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType2Code
	 * ATMServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfileWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType2Code ProfileWithdrawal = new ATMServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfileWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType2Code.mmObject();
			codeName = ATMServiceTypeCode.ProfileWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType2Code
	 * ATMServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType2Code StandardWithdrawal = new ATMServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType2Code.mmObject();
			codeName = ATMServiceTypeCode.StandardWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType2Code
	 * ATMServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupervisedWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType2Code SupervisedWithdrawal = new ATMServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupervisedWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType2Code.mmObject();
			codeName = ATMServiceTypeCode.SupervisedWithdrawal.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ATMServiceType2Code> codesByName = new LinkedHashMap<>();

	protected ATMServiceType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMServiceType2Code";
				definition = "Describes the type of ATM transaction selected by the customer.";
				nextVersions_lazy = () -> Arrays.asList(ATMServiceType5Code.mmObject());
				trace_lazy = () -> ATMServiceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMServiceType2Code.ChosenWithdrawal, com.tools20022.repository.codeset.ATMServiceType2Code.PINChange,
						com.tools20022.repository.codeset.ATMServiceType2Code.PINRecovery, com.tools20022.repository.codeset.ATMServiceType2Code.PINUnblock, com.tools20022.repository.codeset.ATMServiceType2Code.PreAuthorisedWithdrawal,
						com.tools20022.repository.codeset.ATMServiceType2Code.ProfileWithdrawal, com.tools20022.repository.codeset.ATMServiceType2Code.StandardWithdrawal,
						com.tools20022.repository.codeset.ATMServiceType2Code.SupervisedWithdrawal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ChosenWithdrawal.getCodeName().get(), ChosenWithdrawal);
		codesByName.put(PINChange.getCodeName().get(), PINChange);
		codesByName.put(PINRecovery.getCodeName().get(), PINRecovery);
		codesByName.put(PINUnblock.getCodeName().get(), PINUnblock);
		codesByName.put(PreAuthorisedWithdrawal.getCodeName().get(), PreAuthorisedWithdrawal);
		codesByName.put(ProfileWithdrawal.getCodeName().get(), ProfileWithdrawal);
		codesByName.put(StandardWithdrawal.getCodeName().get(), StandardWithdrawal);
		codesByName.put(SupervisedWithdrawal.getCodeName().get(), SupervisedWithdrawal);
	}

	public static ATMServiceType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMServiceType2Code[] values() {
		ATMServiceType2Code[] values = new ATMServiceType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMServiceType2Code> {
		@Override
		public ATMServiceType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMServiceType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}