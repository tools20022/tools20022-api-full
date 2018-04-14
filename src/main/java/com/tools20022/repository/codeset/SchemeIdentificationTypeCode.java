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
import com.tools20022.repository.codeset.SchemeIdentificationTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Domain of an identifier.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationTypeCode#Account
 * SchemeIdentificationTypeCode.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationTypeCode#ClearingMemberAccount
 * SchemeIdentificationTypeCode.ClearingMemberAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationTypeCode#Client
 * SchemeIdentificationTypeCode.Client}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationTypeCode#Scenario
 * SchemeIdentificationTypeCode.Scenario}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationTypeCode#PositionAccount
 * SchemeIdentificationTypeCode.PositionAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationTypeCode#CollateralAccount
 * SchemeIdentificationTypeCode.CollateralAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationTypeCode#MarginAccount
 * SchemeIdentificationTypeCode.MarginAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationType1Code
 * SchemeIdentificationType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SchemeIdentificationTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Domain of an identifier."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SchemeIdentificationTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Construct under a CCP rulebook where the losses of all positions
	 * registered to the account can be used to offset losses of any other
	 * position on that account upon the default of the clearing member
	 * guaranteeing the performance of such account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationTypeCode
	 * SchemeIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Construct under a CCP rulebook where the losses of all positions registered to the account can be used to offset losses of any other position on that account upon the default of the clearing member guaranteeing the performance of such account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SchemeIdentificationTypeCode Account = new SchemeIdentificationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Construct under a CCP rulebook where the losses of all positions registered to the account can be used to offset losses of any other position on that account upon the default of the clearing member guaranteeing the performance of such account.";
			owner_lazy = () -> com.tools20022.repository.codeset.SchemeIdentificationTypeCode.mmObject();
			codeName = "ACCT";
		}
	};
	/**
	 * Legal entity that is a participant in a clearing service of a central
	 * counterparty, that is the legal counterparty to all novated trades for
	 * all the accounts associated with such counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationTypeCode
	 * SchemeIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLIM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingMemberAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal entity that is a participant in a clearing service of a central counterparty, that is the legal counterparty to all novated trades for all the accounts associated with such counterparty."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SchemeIdentificationTypeCode ClearingMemberAccount = new SchemeIdentificationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingMemberAccount";
			definition = "Legal entity that is a participant in a clearing service of a central counterparty, that is the legal counterparty to all novated trades for all the accounts associated with such counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.SchemeIdentificationTypeCode.mmObject();
			codeName = "CLIM";
		}
	};
	/**
	 * Legal entity that clears trades through a client account of a clearing
	 * member of a central counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationTypeCode
	 * SchemeIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLIE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Client"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal entity that clears trades through a client account of a clearing member of a central counterparty."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SchemeIdentificationTypeCode Client = new SchemeIdentificationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Client";
			definition = "Legal entity that clears trades through a client account of a clearing member of a central counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.SchemeIdentificationTypeCode.mmObject();
			codeName = "CLIE";
		}
	};
	/**
	 * Replay of historical events or other set of hypothetical conditions
	 * designed to assess the performance of a portfolio of financial
	 * instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationTypeCode
	 * SchemeIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCEN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scenario"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Replay of historical events or other set of hypothetical conditions designed to assess the performance of a portfolio of financial instruments."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SchemeIdentificationTypeCode Scenario = new SchemeIdentificationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Scenario";
			definition = "Replay of historical events or other set of hypothetical conditions designed to assess the performance of a portfolio of financial instruments.";
			owner_lazy = () -> com.tools20022.repository.codeset.SchemeIdentificationTypeCode.mmObject();
			codeName = "SCEN";
		}
	};
	/**
	 * Operational construct used to record a position in a set of financial
	 * instruments, often linked by a common set of characteristics, ownership
	 * or trading strategy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationTypeCode
	 * SchemeIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POSI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Operational construct used to record a position in a set of financial instruments, often linked by a common set of characteristics, ownership or trading strategy."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SchemeIdentificationTypeCode PositionAccount = new SchemeIdentificationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionAccount";
			definition = "Operational construct used to record a position in a set of financial instruments, often linked by a common set of characteristics, ownership or trading strategy.";
			owner_lazy = () -> com.tools20022.repository.codeset.SchemeIdentificationTypeCode.mmObject();
			codeName = "POSI";
		}
	};
	/**
	 * Operational construct used by a central counterparty to record ownership
	 * of assets posted as collateral by clearing members to meet their
	 * obligations at the central counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationTypeCode
	 * SchemeIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Operational construct used by a central counterparty to record ownership of assets posted as collateral by clearing members to meet their obligations at the central counterparty."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SchemeIdentificationTypeCode CollateralAccount = new SchemeIdentificationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralAccount";
			definition = "Operational construct used by a central counterparty to record ownership of assets posted as collateral by clearing members to meet their obligations at the central counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.SchemeIdentificationTypeCode.mmObject();
			codeName = "COLL";
		}
	};
	/**
	 * Operational construct used to record the set of positions whose margin
	 * requirements is calculated on a gross basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationTypeCode
	 * SchemeIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MARG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Operational construct used to record the set of positions whose margin requirements is calculated on a gross basis."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SchemeIdentificationTypeCode MarginAccount = new SchemeIdentificationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginAccount";
			definition = "Operational construct used to record the set of positions whose margin requirements is calculated on a gross basis.";
			owner_lazy = () -> com.tools20022.repository.codeset.SchemeIdentificationTypeCode.mmObject();
			codeName = "MARG";
		}
	};
	final static private LinkedHashMap<String, SchemeIdentificationTypeCode> codesByName = new LinkedHashMap<>();

	protected SchemeIdentificationTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SchemeIdentificationTypeCode";
				definition = "Domain of an identifier.";
				derivation_lazy = () -> Arrays.asList(SchemeIdentificationType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SchemeIdentificationTypeCode.Account, com.tools20022.repository.codeset.SchemeIdentificationTypeCode.ClearingMemberAccount,
						com.tools20022.repository.codeset.SchemeIdentificationTypeCode.Client, com.tools20022.repository.codeset.SchemeIdentificationTypeCode.Scenario,
						com.tools20022.repository.codeset.SchemeIdentificationTypeCode.PositionAccount, com.tools20022.repository.codeset.SchemeIdentificationTypeCode.CollateralAccount,
						com.tools20022.repository.codeset.SchemeIdentificationTypeCode.MarginAccount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Account.getCodeName().get(), Account);
		codesByName.put(ClearingMemberAccount.getCodeName().get(), ClearingMemberAccount);
		codesByName.put(Client.getCodeName().get(), Client);
		codesByName.put(Scenario.getCodeName().get(), Scenario);
		codesByName.put(PositionAccount.getCodeName().get(), PositionAccount);
		codesByName.put(CollateralAccount.getCodeName().get(), CollateralAccount);
		codesByName.put(MarginAccount.getCodeName().get(), MarginAccount);
	}

	public static SchemeIdentificationTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SchemeIdentificationTypeCode[] values() {
		SchemeIdentificationTypeCode[] values = new SchemeIdentificationTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SchemeIdentificationTypeCode> {
		@Override
		public SchemeIdentificationTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SchemeIdentificationTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}