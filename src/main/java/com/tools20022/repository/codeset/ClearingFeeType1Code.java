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
import com.tools20022.repository.codeset.ClearingFeeTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the type of fee being assessed of the customer for trade executions
 * at an exchange. Applicable for futures markets only at this time.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode
 * ClearingFeeTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code#mmCBOEMember
 * ClearingFeeType1Code.mmCBOEMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code#mmNonMemberAndCustomer
 * ClearingFeeType1Code.mmNonMemberAndCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code#mmEquityClearingMember
 * ClearingFeeType1Code.mmEquityClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code#mmFullAssociateMember
 * ClearingFeeType1Code.mmFullAssociateMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code#mmJ106AndHFirms
 * ClearingFeeType1Code.mmJ106AndHFirms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code#mmGICInterestHolders
 * ClearingFeeType1Code.mmGICInterestHolders}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code#mmLesseeAnd106FFirms
 * ClearingFeeType1Code.mmLesseeAnd106FFirms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code#mmOtherOwnershipTypes
 * ClearingFeeType1Code.mmOtherOwnershipTypes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code#mmFirstYearOwnAccount
 * ClearingFeeType1Code.mmFirstYearOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code#mmSecondYearOwnAccount
 * ClearingFeeType1Code.mmSecondYearOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code#mmThirdYearOwnAccount
 * ClearingFeeType1Code.mmThirdYearOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code#mmFourthYearOwnAccount
 * ClearingFeeType1Code.mmFourthYearOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code#mmFifthYearOwnAccount
 * ClearingFeeType1Code.mmFifthYearOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code#mmMoreThanFiveYearOwnAccount
 * ClearingFeeType1Code.mmMoreThanFiveYearOwnAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CBOE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ClearingFeeType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the type of fee being assessed of the customer for trade executions at an exchange. Applicable for futures markets only at this time."
 * </li>
 * </ul>
 */
public class ClearingFeeType1Code extends ClearingFeeTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code
	 * ClearingFeeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CBOEMember"</li>
	 * </ul>
	 */
	public static final MMCode mmCBOEMember = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CBOEMember";
			owner_lazy = () -> ClearingFeeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code
	 * ClearingFeeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonMemberAndCustomer"</li>
	 * </ul>
	 */
	public static final MMCode mmNonMemberAndCustomer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonMemberAndCustomer";
			owner_lazy = () -> ClearingFeeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code
	 * ClearingFeeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityClearingMember"</li>
	 * </ul>
	 */
	public static final MMCode mmEquityClearingMember = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityClearingMember";
			owner_lazy = () -> ClearingFeeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code
	 * ClearingFeeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullAssociateMember"</li>
	 * </ul>
	 */
	public static final MMCode mmFullAssociateMember = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullAssociateMember";
			owner_lazy = () -> ClearingFeeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code
	 * ClearingFeeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "J106AndHFirms"</li>
	 * </ul>
	 */
	public static final MMCode mmJ106AndHFirms = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "J106AndHFirms";
			owner_lazy = () -> ClearingFeeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code
	 * ClearingFeeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GICInterestHolders"</li>
	 * </ul>
	 */
	public static final MMCode mmGICInterestHolders = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GICInterestHolders";
			owner_lazy = () -> ClearingFeeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code
	 * ClearingFeeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LesseeAnd106FFirms"</li>
	 * </ul>
	 */
	public static final MMCode mmLesseeAnd106FFirms = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LesseeAnd106FFirms";
			owner_lazy = () -> ClearingFeeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code
	 * ClearingFeeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherOwnershipTypes"</li>
	 * </ul>
	 */
	public static final MMCode mmOtherOwnershipTypes = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherOwnershipTypes";
			owner_lazy = () -> ClearingFeeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code
	 * ClearingFeeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstYearOwnAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmFirstYearOwnAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstYearOwnAccount";
			owner_lazy = () -> ClearingFeeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code
	 * ClearingFeeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondYearOwnAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmSecondYearOwnAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondYearOwnAccount";
			owner_lazy = () -> ClearingFeeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code
	 * ClearingFeeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdYearOwnAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmThirdYearOwnAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdYearOwnAccount";
			owner_lazy = () -> ClearingFeeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code
	 * ClearingFeeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourthYearOwnAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmFourthYearOwnAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourthYearOwnAccount";
			owner_lazy = () -> ClearingFeeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code
	 * ClearingFeeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FifthYearOwnAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmFifthYearOwnAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FifthYearOwnAccount";
			owner_lazy = () -> ClearingFeeType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code
	 * ClearingFeeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoreThanFiveYearOwnAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmMoreThanFiveYearOwnAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoreThanFiveYearOwnAccount";
			owner_lazy = () -> ClearingFeeType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("CBOE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ClearingFeeType1Code";
				definition = "Indicates the type of fee being assessed of the customer for trade executions at an exchange. Applicable for futures markets only at this time.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ClearingFeeType1Code.mmCBOEMember, com.tools20022.repository.codeset.ClearingFeeType1Code.mmNonMemberAndCustomer,
						com.tools20022.repository.codeset.ClearingFeeType1Code.mmEquityClearingMember, com.tools20022.repository.codeset.ClearingFeeType1Code.mmFullAssociateMember,
						com.tools20022.repository.codeset.ClearingFeeType1Code.mmJ106AndHFirms, com.tools20022.repository.codeset.ClearingFeeType1Code.mmGICInterestHolders,
						com.tools20022.repository.codeset.ClearingFeeType1Code.mmLesseeAnd106FFirms, com.tools20022.repository.codeset.ClearingFeeType1Code.mmOtherOwnershipTypes,
						com.tools20022.repository.codeset.ClearingFeeType1Code.mmFirstYearOwnAccount, com.tools20022.repository.codeset.ClearingFeeType1Code.mmSecondYearOwnAccount,
						com.tools20022.repository.codeset.ClearingFeeType1Code.mmThirdYearOwnAccount, com.tools20022.repository.codeset.ClearingFeeType1Code.mmFourthYearOwnAccount,
						com.tools20022.repository.codeset.ClearingFeeType1Code.mmFifthYearOwnAccount, com.tools20022.repository.codeset.ClearingFeeType1Code.mmMoreThanFiveYearOwnAccount);
				trace_lazy = () -> ClearingFeeTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}