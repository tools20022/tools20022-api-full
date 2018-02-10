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
import com.tools20022.repository.codeset.SecuritiesEntryType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of securities entry on an account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code#Blocked
 * SecuritiesEntryType2Code.Blocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code#Eligible
 * SecuritiesEntryType2Code.Eligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code#PendingDelivery
 * SecuritiesEntryType2Code.PendingDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code#PendingReceipt
 * SecuritiesEntryType2Code.PendingReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code#Registered
 * SecuritiesEntryType2Code.Registered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code#Settled
 * SecuritiesEntryType2Code.Settled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code#Borrowed
 * SecuritiesEntryType2Code.Borrowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code#OnLoan
 * SecuritiesEntryType2Code.OnLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code#StreetPosition
 * SecuritiesEntryType2Code.StreetPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code#Traded
 * SecuritiesEntryType2Code.Traded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code#CollateralIn
 * SecuritiesEntryType2Code.CollateralIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code#CollateralOut
 * SecuritiesEntryType2Code.CollateralOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code#UninstructedBalance
 * SecuritiesEntryType2Code.UninstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code#InstructedBalance
 * SecuritiesEntryType2Code.InstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code#OutForRegistration
 * SecuritiesEntryType2Code.OutForRegistration}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryTypeCode
 * SecuritiesEntryTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BLOK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesEntryType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of securities entry on an account."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesEntryType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code
	 * SecuritiesEntryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocked"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType2Code Blocked = new SecuritiesEntryType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocked";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType2Code.mmObject();
			codeName = SecuritiesEntryTypeCode.Blocked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code
	 * SecuritiesEntryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Eligible"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType2Code Eligible = new SecuritiesEntryType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Eligible";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType2Code.mmObject();
			codeName = SecuritiesEntryTypeCode.Eligible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code
	 * SecuritiesEntryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDelivery"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType2Code PendingDelivery = new SecuritiesEntryType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType2Code.mmObject();
			codeName = SecuritiesEntryTypeCode.PendingDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code
	 * SecuritiesEntryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceipt"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType2Code PendingReceipt = new SecuritiesEntryType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType2Code.mmObject();
			codeName = SecuritiesEntryTypeCode.PendingReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code
	 * SecuritiesEntryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registered"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType2Code Registered = new SecuritiesEntryType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registered";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType2Code.mmObject();
			codeName = SecuritiesEntryTypeCode.Registered.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code
	 * SecuritiesEntryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType2Code Settled = new SecuritiesEntryType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType2Code.mmObject();
			codeName = SecuritiesEntryTypeCode.Settled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code
	 * SecuritiesEntryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Borrowed"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType2Code Borrowed = new SecuritiesEntryType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrowed";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType2Code.mmObject();
			codeName = SecuritiesEntryTypeCode.Borrowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code
	 * SecuritiesEntryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLoan"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType2Code OnLoan = new SecuritiesEntryType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLoan";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType2Code.mmObject();
			codeName = SecuritiesEntryTypeCode.OnLoan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code
	 * SecuritiesEntryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetPosition"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType2Code StreetPosition = new SecuritiesEntryType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetPosition";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType2Code.mmObject();
			codeName = SecuritiesEntryTypeCode.StreetPosition.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code
	 * SecuritiesEntryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Traded"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType2Code Traded = new SecuritiesEntryType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Traded";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType2Code.mmObject();
			codeName = SecuritiesEntryTypeCode.Traded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code
	 * SecuritiesEntryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIn"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType2Code CollateralIn = new SecuritiesEntryType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIn";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType2Code.mmObject();
			codeName = SecuritiesEntryTypeCode.CollateralIn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code
	 * SecuritiesEntryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOut"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType2Code CollateralOut = new SecuritiesEntryType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOut";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType2Code.mmObject();
			codeName = SecuritiesEntryTypeCode.CollateralOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code
	 * SecuritiesEntryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UninstructedBalance"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType2Code UninstructedBalance = new SecuritiesEntryType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UninstructedBalance";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType2Code.mmObject();
			codeName = SecuritiesEntryTypeCode.UninstructedBalance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code
	 * SecuritiesEntryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedBalance"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType2Code InstructedBalance = new SecuritiesEntryType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedBalance";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType2Code.mmObject();
			codeName = SecuritiesEntryTypeCode.InstructedBalance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code
	 * SecuritiesEntryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutForRegistration"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType2Code OutForRegistration = new SecuritiesEntryType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutForRegistration";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType2Code.mmObject();
			codeName = SecuritiesEntryTypeCode.OutForRegistration.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SecuritiesEntryType2Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesEntryType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BLOK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesEntryType2Code";
				definition = "Specifies the type of securities entry on an account.";
				trace_lazy = () -> SecuritiesEntryTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesEntryType2Code.Blocked, com.tools20022.repository.codeset.SecuritiesEntryType2Code.Eligible,
						com.tools20022.repository.codeset.SecuritiesEntryType2Code.PendingDelivery, com.tools20022.repository.codeset.SecuritiesEntryType2Code.PendingReceipt,
						com.tools20022.repository.codeset.SecuritiesEntryType2Code.Registered, com.tools20022.repository.codeset.SecuritiesEntryType2Code.Settled, com.tools20022.repository.codeset.SecuritiesEntryType2Code.Borrowed,
						com.tools20022.repository.codeset.SecuritiesEntryType2Code.OnLoan, com.tools20022.repository.codeset.SecuritiesEntryType2Code.StreetPosition, com.tools20022.repository.codeset.SecuritiesEntryType2Code.Traded,
						com.tools20022.repository.codeset.SecuritiesEntryType2Code.CollateralIn, com.tools20022.repository.codeset.SecuritiesEntryType2Code.CollateralOut,
						com.tools20022.repository.codeset.SecuritiesEntryType2Code.UninstructedBalance, com.tools20022.repository.codeset.SecuritiesEntryType2Code.InstructedBalance,
						com.tools20022.repository.codeset.SecuritiesEntryType2Code.OutForRegistration);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Blocked.getCodeName().get(), Blocked);
		codesByName.put(Eligible.getCodeName().get(), Eligible);
		codesByName.put(PendingDelivery.getCodeName().get(), PendingDelivery);
		codesByName.put(PendingReceipt.getCodeName().get(), PendingReceipt);
		codesByName.put(Registered.getCodeName().get(), Registered);
		codesByName.put(Settled.getCodeName().get(), Settled);
		codesByName.put(Borrowed.getCodeName().get(), Borrowed);
		codesByName.put(OnLoan.getCodeName().get(), OnLoan);
		codesByName.put(StreetPosition.getCodeName().get(), StreetPosition);
		codesByName.put(Traded.getCodeName().get(), Traded);
		codesByName.put(CollateralIn.getCodeName().get(), CollateralIn);
		codesByName.put(CollateralOut.getCodeName().get(), CollateralOut);
		codesByName.put(UninstructedBalance.getCodeName().get(), UninstructedBalance);
		codesByName.put(InstructedBalance.getCodeName().get(), InstructedBalance);
		codesByName.put(OutForRegistration.getCodeName().get(), OutForRegistration);
	}

	public static SecuritiesEntryType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesEntryType2Code[] values() {
		SecuritiesEntryType2Code[] values = new SecuritiesEntryType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesEntryType2Code> {
		@Override
		public SecuritiesEntryType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesEntryType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}