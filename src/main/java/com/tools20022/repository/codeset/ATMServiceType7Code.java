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
import com.tools20022.repository.codeset.ATMServiceType7Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code#ChosenWithdrawal
 * ATMServiceType7Code.ChosenWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code#PINChange
 * ATMServiceType7Code.PINChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code#PINRecovery
 * ATMServiceType7Code.PINRecovery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code#PINUnblock
 * ATMServiceType7Code.PINUnblock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code#PreAuthorisedWithdrawal
 * ATMServiceType7Code.PreAuthorisedWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code#ProfileWithdrawal
 * ATMServiceType7Code.ProfileWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code#StandardWithdrawal
 * ATMServiceType7Code.StandardWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code#SupervisedWithdrawal
 * ATMServiceType7Code.SupervisedWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code#CustomerTransfer
 * ATMServiceType7Code.CustomerTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code#InterCustomerTransfer
 * ATMServiceType7Code.InterCustomerTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code#NonVerifiedDeposit
 * ATMServiceType7Code.NonVerifiedDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code#VerifiedDeposit
 * ATMServiceType7Code.VerifiedDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code#MakingChange
 * ATMServiceType7Code.MakingChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code#Payment
 * ATMServiceType7Code.Payment}</li>
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
 * "ATMServiceType7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the type of ATM transaction selected by the customer."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMServiceType7Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code
	 * ATMServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChosenWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType7Code ChosenWithdrawal = new ATMServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChosenWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType7Code.mmObject();
			codeName = ATMServiceTypeCode.ChosenWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code
	 * ATMServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINChange"</li>
	 * </ul>
	 */
	public static final ATMServiceType7Code PINChange = new ATMServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINChange";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType7Code.mmObject();
			codeName = ATMServiceTypeCode.PINChange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code
	 * ATMServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINRecovery"</li>
	 * </ul>
	 */
	public static final ATMServiceType7Code PINRecovery = new ATMServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINRecovery";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType7Code.mmObject();
			codeName = ATMServiceTypeCode.PINRecovery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code
	 * ATMServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINUnblock"</li>
	 * </ul>
	 */
	public static final ATMServiceType7Code PINUnblock = new ATMServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINUnblock";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType7Code.mmObject();
			codeName = ATMServiceTypeCode.PINUnblock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code
	 * ATMServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAuthorisedWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType7Code PreAuthorisedWithdrawal = new ATMServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAuthorisedWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType7Code.mmObject();
			codeName = ATMServiceTypeCode.PreAuthorisedWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code
	 * ATMServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfileWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType7Code ProfileWithdrawal = new ATMServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfileWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType7Code.mmObject();
			codeName = ATMServiceTypeCode.ProfileWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code
	 * ATMServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType7Code StandardWithdrawal = new ATMServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType7Code.mmObject();
			codeName = ATMServiceTypeCode.StandardWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code
	 * ATMServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupervisedWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType7Code SupervisedWithdrawal = new ATMServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupervisedWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType7Code.mmObject();
			codeName = ATMServiceTypeCode.SupervisedWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code
	 * ATMServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerTransfer"</li>
	 * </ul>
	 */
	public static final ATMServiceType7Code CustomerTransfer = new ATMServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType7Code.mmObject();
			codeName = ATMServiceTypeCode.CustomerTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code
	 * ATMServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterCustomerTransfer"</li>
	 * </ul>
	 */
	public static final ATMServiceType7Code InterCustomerTransfer = new ATMServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterCustomerTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType7Code.mmObject();
			codeName = ATMServiceTypeCode.InterCustomerTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code
	 * ATMServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonVerifiedDeposit"</li>
	 * </ul>
	 */
	public static final ATMServiceType7Code NonVerifiedDeposit = new ATMServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonVerifiedDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType7Code.mmObject();
			codeName = ATMServiceTypeCode.NonVerifiedDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code
	 * ATMServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VerifiedDeposit"</li>
	 * </ul>
	 */
	public static final ATMServiceType7Code VerifiedDeposit = new ATMServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VerifiedDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType7Code.mmObject();
			codeName = ATMServiceTypeCode.VerifiedDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code
	 * ATMServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MakingChange"</li>
	 * </ul>
	 */
	public static final ATMServiceType7Code MakingChange = new ATMServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MakingChange";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType7Code.mmObject();
			codeName = ATMServiceTypeCode.MakingChange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType7Code
	 * ATMServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * </ul>
	 */
	public static final ATMServiceType7Code Payment = new ATMServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType7Code.mmObject();
			codeName = ATMServiceTypeCode.Payment.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ATMServiceType7Code> codesByName = new LinkedHashMap<>();

	protected ATMServiceType7Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMServiceType7Code";
				definition = "Describes the type of ATM transaction selected by the customer.";
				trace_lazy = () -> ATMServiceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMServiceType7Code.ChosenWithdrawal, com.tools20022.repository.codeset.ATMServiceType7Code.PINChange,
						com.tools20022.repository.codeset.ATMServiceType7Code.PINRecovery, com.tools20022.repository.codeset.ATMServiceType7Code.PINUnblock, com.tools20022.repository.codeset.ATMServiceType7Code.PreAuthorisedWithdrawal,
						com.tools20022.repository.codeset.ATMServiceType7Code.ProfileWithdrawal, com.tools20022.repository.codeset.ATMServiceType7Code.StandardWithdrawal,
						com.tools20022.repository.codeset.ATMServiceType7Code.SupervisedWithdrawal, com.tools20022.repository.codeset.ATMServiceType7Code.CustomerTransfer,
						com.tools20022.repository.codeset.ATMServiceType7Code.InterCustomerTransfer, com.tools20022.repository.codeset.ATMServiceType7Code.NonVerifiedDeposit,
						com.tools20022.repository.codeset.ATMServiceType7Code.VerifiedDeposit, com.tools20022.repository.codeset.ATMServiceType7Code.MakingChange, com.tools20022.repository.codeset.ATMServiceType7Code.Payment);
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
		codesByName.put(CustomerTransfer.getCodeName().get(), CustomerTransfer);
		codesByName.put(InterCustomerTransfer.getCodeName().get(), InterCustomerTransfer);
		codesByName.put(NonVerifiedDeposit.getCodeName().get(), NonVerifiedDeposit);
		codesByName.put(VerifiedDeposit.getCodeName().get(), VerifiedDeposit);
		codesByName.put(MakingChange.getCodeName().get(), MakingChange);
		codesByName.put(Payment.getCodeName().get(), Payment);
	}

	public static ATMServiceType7Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMServiceType7Code[] values() {
		ATMServiceType7Code[] values = new ATMServiceType7Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMServiceType7Code> {
		@Override
		public ATMServiceType7Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMServiceType7Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}