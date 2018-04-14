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
import com.tools20022.repository.codeset.PaymentRole1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Role associated with a specific party in relation to a payment instruction.
 * The role identifies either the specific function of the party, or the party's
 * rights regarding management of the instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentRole1Code#LiquidityManager
 * PaymentRole1Code.LiquidityManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentRole1Code#LimitManager
 * PaymentRole1Code.LimitManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentRole1Code#PaymentManager
 * PaymentRole1Code.PaymentManager}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentRole1Code#Reader
 * PaymentRole1Code.Reader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentRole1Code#BackupManager
 * PaymentRole1Code.BackupManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentRole1Code#SettlementManager
 * PaymentRole1Code.SettlementManager}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode PartyRoleCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentRole1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Role associated with a specific party in relation to a payment instruction. The role identifies either the specific function of the party, or the party's rights regarding management of the instruction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"LQMG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PaymentRole1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentRole1Code
	 * PaymentRole1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentRole1Code LiquidityManager = new PaymentRole1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityManager";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentRole1Code.mmObject();
			codeName = PartyRoleCode.LiquidityManager.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentRole1Code
	 * PaymentRole1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentRole1Code LimitManager = new PaymentRole1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitManager";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentRole1Code.mmObject();
			codeName = PartyRoleCode.LimitManager.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentRole1Code
	 * PaymentRole1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentRole1Code PaymentManager = new PaymentRole1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentManager";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentRole1Code.mmObject();
			codeName = PartyRoleCode.PaymentManager.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentRole1Code
	 * PaymentRole1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentRole1Code Reader = new PaymentRole1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reader";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentRole1Code.mmObject();
			codeName = PartyRoleCode.Reader.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentRole1Code
	 * PaymentRole1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackupManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentRole1Code BackupManager = new PaymentRole1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackupManager";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentRole1Code.mmObject();
			codeName = PartyRoleCode.BackupManager.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentRole1Code
	 * PaymentRole1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentRole1Code SettlementManager = new PaymentRole1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementManager";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentRole1Code.mmObject();
			codeName = PartyRoleCode.SettlementManager.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PaymentRole1Code> codesByName = new LinkedHashMap<>();

	protected PaymentRole1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("LQMG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentRole1Code";
				definition = "Role associated with a specific party in relation to a payment instruction. The role identifies either the specific function of the party, or the party's rights regarding management of the instruction.";
				trace_lazy = () -> PartyRoleCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentRole1Code.LiquidityManager, com.tools20022.repository.codeset.PaymentRole1Code.LimitManager,
						com.tools20022.repository.codeset.PaymentRole1Code.PaymentManager, com.tools20022.repository.codeset.PaymentRole1Code.Reader, com.tools20022.repository.codeset.PaymentRole1Code.BackupManager,
						com.tools20022.repository.codeset.PaymentRole1Code.SettlementManager);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(LiquidityManager.getCodeName().get(), LiquidityManager);
		codesByName.put(LimitManager.getCodeName().get(), LimitManager);
		codesByName.put(PaymentManager.getCodeName().get(), PaymentManager);
		codesByName.put(Reader.getCodeName().get(), Reader);
		codesByName.put(BackupManager.getCodeName().get(), BackupManager);
		codesByName.put(SettlementManager.getCodeName().get(), SettlementManager);
	}

	public static PaymentRole1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PaymentRole1Code[] values() {
		PaymentRole1Code[] values = new PaymentRole1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PaymentRole1Code> {
		@Override
		public PaymentRole1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PaymentRole1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}