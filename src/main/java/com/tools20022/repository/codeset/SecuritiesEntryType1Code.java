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
import com.tools20022.repository.codeset.SecuritiesEntryType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType1Code#Blocked
 * SecuritiesEntryType1Code.Blocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType1Code#Eligible
 * SecuritiesEntryType1Code.Eligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType1Code#PendingDelivery
 * SecuritiesEntryType1Code.PendingDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType1Code#PendingReceipt
 * SecuritiesEntryType1Code.PendingReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType1Code#Registered
 * SecuritiesEntryType1Code.Registered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType1Code#Settled
 * SecuritiesEntryType1Code.Settled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType1Code#Borrowed
 * SecuritiesEntryType1Code.Borrowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType1Code#OnLoan
 * SecuritiesEntryType1Code.OnLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType1Code#StreetPosition
 * SecuritiesEntryType1Code.StreetPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType1Code#Traded
 * SecuritiesEntryType1Code.Traded}</li>
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
 * "SecuritiesEntryType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of securities entry on an account."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesEntryType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType1Code
	 * SecuritiesEntryType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocked"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType1Code Blocked = new SecuritiesEntryType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocked";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType1Code.mmObject();
			codeName = SecuritiesEntryTypeCode.Blocked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType1Code
	 * SecuritiesEntryType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Eligible"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType1Code Eligible = new SecuritiesEntryType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Eligible";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType1Code.mmObject();
			codeName = SecuritiesEntryTypeCode.Eligible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType1Code
	 * SecuritiesEntryType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDelivery"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType1Code PendingDelivery = new SecuritiesEntryType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType1Code.mmObject();
			codeName = SecuritiesEntryTypeCode.PendingDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType1Code
	 * SecuritiesEntryType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceipt"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType1Code PendingReceipt = new SecuritiesEntryType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType1Code.mmObject();
			codeName = SecuritiesEntryTypeCode.PendingReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType1Code
	 * SecuritiesEntryType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registered"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType1Code Registered = new SecuritiesEntryType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registered";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType1Code.mmObject();
			codeName = SecuritiesEntryTypeCode.Registered.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType1Code
	 * SecuritiesEntryType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType1Code Settled = new SecuritiesEntryType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType1Code.mmObject();
			codeName = SecuritiesEntryTypeCode.Settled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType1Code
	 * SecuritiesEntryType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Borrowed"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType1Code Borrowed = new SecuritiesEntryType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrowed";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType1Code.mmObject();
			codeName = SecuritiesEntryTypeCode.Borrowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType1Code
	 * SecuritiesEntryType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLoan"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType1Code OnLoan = new SecuritiesEntryType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLoan";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType1Code.mmObject();
			codeName = SecuritiesEntryTypeCode.OnLoan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType1Code
	 * SecuritiesEntryType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetPosition"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType1Code StreetPosition = new SecuritiesEntryType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetPosition";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType1Code.mmObject();
			codeName = SecuritiesEntryTypeCode.StreetPosition.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType1Code
	 * SecuritiesEntryType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Traded"</li>
	 * </ul>
	 */
	public static final SecuritiesEntryType1Code Traded = new SecuritiesEntryType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Traded";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesEntryType1Code.mmObject();
			codeName = SecuritiesEntryTypeCode.Traded.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SecuritiesEntryType1Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesEntryType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BLOK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesEntryType1Code";
				definition = "Specifies the type of securities entry on an account.";
				trace_lazy = () -> SecuritiesEntryTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesEntryType1Code.Blocked, com.tools20022.repository.codeset.SecuritiesEntryType1Code.Eligible,
						com.tools20022.repository.codeset.SecuritiesEntryType1Code.PendingDelivery, com.tools20022.repository.codeset.SecuritiesEntryType1Code.PendingReceipt,
						com.tools20022.repository.codeset.SecuritiesEntryType1Code.Registered, com.tools20022.repository.codeset.SecuritiesEntryType1Code.Settled, com.tools20022.repository.codeset.SecuritiesEntryType1Code.Borrowed,
						com.tools20022.repository.codeset.SecuritiesEntryType1Code.OnLoan, com.tools20022.repository.codeset.SecuritiesEntryType1Code.StreetPosition, com.tools20022.repository.codeset.SecuritiesEntryType1Code.Traded);
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
	}

	public static SecuritiesEntryType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesEntryType1Code[] values() {
		SecuritiesEntryType1Code[] values = new SecuritiesEntryType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesEntryType1Code> {
		@Override
		public SecuritiesEntryType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesEntryType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}