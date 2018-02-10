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
import com.tools20022.repository.codeset.ATMServiceType8Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of service to be offered for a customer at an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code#AccountStatements
 * ATMServiceType8Code.AccountStatements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code#BalanceInquiry
 * ATMServiceType8Code.BalanceInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code#PINChange
 * ATMServiceType8Code.PINChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code#StandardWithdrawal
 * ATMServiceType8Code.StandardWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code#ProfileWithdrawal
 * ATMServiceType8Code.ProfileWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code#PreAuthorisedWithdrawal
 * ATMServiceType8Code.PreAuthorisedWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code#ChosenWithdrawal
 * ATMServiceType8Code.ChosenWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code#CustomerTransfer
 * ATMServiceType8Code.CustomerTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code#InterCustomerTransfer
 * ATMServiceType8Code.InterCustomerTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code#MakingChange
 * ATMServiceType8Code.MakingChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code#NonVerifiedDeposit
 * ATMServiceType8Code.NonVerifiedDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code#PINRecovery
 * ATMServiceType8Code.PINRecovery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code#PINUnblock
 * ATMServiceType8Code.PINUnblock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code#SupervisedWithdrawal
 * ATMServiceType8Code.SupervisedWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code#VerifiedDeposit
 * ATMServiceType8Code.VerifiedDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code#Payment
 * ATMServiceType8Code.Payment}</li>
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
 * "ATMServiceType8Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of service to be offered for a customer at an ATM."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMServiceType8Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code
	 * ATMServiceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountStatements"</li>
	 * </ul>
	 */
	public static final ATMServiceType8Code AccountStatements = new ATMServiceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountStatements";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType8Code.mmObject();
			codeName = ATMServiceTypeCode.AccountStatements.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code
	 * ATMServiceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceInquiry"</li>
	 * </ul>
	 */
	public static final ATMServiceType8Code BalanceInquiry = new ATMServiceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceInquiry";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType8Code.mmObject();
			codeName = ATMServiceTypeCode.BalanceInquiry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code
	 * ATMServiceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINChange"</li>
	 * </ul>
	 */
	public static final ATMServiceType8Code PINChange = new ATMServiceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINChange";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType8Code.mmObject();
			codeName = ATMServiceTypeCode.PINChange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code
	 * ATMServiceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType8Code StandardWithdrawal = new ATMServiceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType8Code.mmObject();
			codeName = ATMServiceTypeCode.StandardWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code
	 * ATMServiceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfileWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType8Code ProfileWithdrawal = new ATMServiceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfileWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType8Code.mmObject();
			codeName = ATMServiceTypeCode.ProfileWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code
	 * ATMServiceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAuthorisedWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType8Code PreAuthorisedWithdrawal = new ATMServiceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAuthorisedWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType8Code.mmObject();
			codeName = ATMServiceTypeCode.PreAuthorisedWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code
	 * ATMServiceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChosenWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType8Code ChosenWithdrawal = new ATMServiceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChosenWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType8Code.mmObject();
			codeName = ATMServiceTypeCode.ChosenWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code
	 * ATMServiceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerTransfer"</li>
	 * </ul>
	 */
	public static final ATMServiceType8Code CustomerTransfer = new ATMServiceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType8Code.mmObject();
			codeName = ATMServiceTypeCode.CustomerTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code
	 * ATMServiceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterCustomerTransfer"</li>
	 * </ul>
	 */
	public static final ATMServiceType8Code InterCustomerTransfer = new ATMServiceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterCustomerTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType8Code.mmObject();
			codeName = ATMServiceTypeCode.InterCustomerTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code
	 * ATMServiceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MakingChange"</li>
	 * </ul>
	 */
	public static final ATMServiceType8Code MakingChange = new ATMServiceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MakingChange";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType8Code.mmObject();
			codeName = ATMServiceTypeCode.MakingChange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code
	 * ATMServiceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonVerifiedDeposit"</li>
	 * </ul>
	 */
	public static final ATMServiceType8Code NonVerifiedDeposit = new ATMServiceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonVerifiedDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType8Code.mmObject();
			codeName = ATMServiceTypeCode.NonVerifiedDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code
	 * ATMServiceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINRecovery"</li>
	 * </ul>
	 */
	public static final ATMServiceType8Code PINRecovery = new ATMServiceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINRecovery";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType8Code.mmObject();
			codeName = ATMServiceTypeCode.PINRecovery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code
	 * ATMServiceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINUnblock"</li>
	 * </ul>
	 */
	public static final ATMServiceType8Code PINUnblock = new ATMServiceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINUnblock";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType8Code.mmObject();
			codeName = ATMServiceTypeCode.PINUnblock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code
	 * ATMServiceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupervisedWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType8Code SupervisedWithdrawal = new ATMServiceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupervisedWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType8Code.mmObject();
			codeName = ATMServiceTypeCode.SupervisedWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code
	 * ATMServiceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VerifiedDeposit"</li>
	 * </ul>
	 */
	public static final ATMServiceType8Code VerifiedDeposit = new ATMServiceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VerifiedDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType8Code.mmObject();
			codeName = ATMServiceTypeCode.VerifiedDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code
	 * ATMServiceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * </ul>
	 */
	public static final ATMServiceType8Code Payment = new ATMServiceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType8Code.mmObject();
			codeName = ATMServiceTypeCode.Payment.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ATMServiceType8Code> codesByName = new LinkedHashMap<>();

	protected ATMServiceType8Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMServiceType8Code";
				definition = "Type of service to be offered for a customer at an ATM.";
				trace_lazy = () -> ATMServiceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMServiceType8Code.AccountStatements, com.tools20022.repository.codeset.ATMServiceType8Code.BalanceInquiry,
						com.tools20022.repository.codeset.ATMServiceType8Code.PINChange, com.tools20022.repository.codeset.ATMServiceType8Code.StandardWithdrawal, com.tools20022.repository.codeset.ATMServiceType8Code.ProfileWithdrawal,
						com.tools20022.repository.codeset.ATMServiceType8Code.PreAuthorisedWithdrawal, com.tools20022.repository.codeset.ATMServiceType8Code.ChosenWithdrawal,
						com.tools20022.repository.codeset.ATMServiceType8Code.CustomerTransfer, com.tools20022.repository.codeset.ATMServiceType8Code.InterCustomerTransfer,
						com.tools20022.repository.codeset.ATMServiceType8Code.MakingChange, com.tools20022.repository.codeset.ATMServiceType8Code.NonVerifiedDeposit, com.tools20022.repository.codeset.ATMServiceType8Code.PINRecovery,
						com.tools20022.repository.codeset.ATMServiceType8Code.PINUnblock, com.tools20022.repository.codeset.ATMServiceType8Code.SupervisedWithdrawal, com.tools20022.repository.codeset.ATMServiceType8Code.VerifiedDeposit,
						com.tools20022.repository.codeset.ATMServiceType8Code.Payment);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountStatements.getCodeName().get(), AccountStatements);
		codesByName.put(BalanceInquiry.getCodeName().get(), BalanceInquiry);
		codesByName.put(PINChange.getCodeName().get(), PINChange);
		codesByName.put(StandardWithdrawal.getCodeName().get(), StandardWithdrawal);
		codesByName.put(ProfileWithdrawal.getCodeName().get(), ProfileWithdrawal);
		codesByName.put(PreAuthorisedWithdrawal.getCodeName().get(), PreAuthorisedWithdrawal);
		codesByName.put(ChosenWithdrawal.getCodeName().get(), ChosenWithdrawal);
		codesByName.put(CustomerTransfer.getCodeName().get(), CustomerTransfer);
		codesByName.put(InterCustomerTransfer.getCodeName().get(), InterCustomerTransfer);
		codesByName.put(MakingChange.getCodeName().get(), MakingChange);
		codesByName.put(NonVerifiedDeposit.getCodeName().get(), NonVerifiedDeposit);
		codesByName.put(PINRecovery.getCodeName().get(), PINRecovery);
		codesByName.put(PINUnblock.getCodeName().get(), PINUnblock);
		codesByName.put(SupervisedWithdrawal.getCodeName().get(), SupervisedWithdrawal);
		codesByName.put(VerifiedDeposit.getCodeName().get(), VerifiedDeposit);
		codesByName.put(Payment.getCodeName().get(), Payment);
	}

	public static ATMServiceType8Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMServiceType8Code[] values() {
		ATMServiceType8Code[] values = new ATMServiceType8Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMServiceType8Code> {
		@Override
		public ATMServiceType8Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMServiceType8Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}