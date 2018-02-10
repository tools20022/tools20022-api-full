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
import com.tools20022.repository.codeset.TransferReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for the assets transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferReason1Code#UndividedPossession
 * TransferReason1Code.UndividedPossession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferReason1Code#TransferBetweenSpouses
 * TransferReason1Code.TransferBetweenSpouses}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TransferReason1Code#Trade
 * TransferReason1Code.Trade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferReason1Code#OrdinaryTransfer
 * TransferReason1Code.OrdinaryTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferReason1Code#Heritage
 * TransferReason1Code.Heritage}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TransferReason1Code#Gift
 * TransferReason1Code.Gift}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferReason1Code#PledgedAccountTransfer
 * TransferReason1Code.PledgedAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferReason1Code#TDTFrameworkTransfer
 * TransferReason1Code.TDTFrameworkTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferReason1Code#TransferBetweenDifferentBeneficiaries
 * TransferReason1Code.TransferBetweenDifferentBeneficiaries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferReason1Code#Demerger
 * TransferReason1Code.Demerger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferReason1Code#BetweenOwnAccounts
 * TransferReason1Code.BetweenOwnAccounts}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode
 * TransferReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"TRAU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransferReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for the assets transfer."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransferReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReason1Code
	 * TransferReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndividedPossession"</li>
	 * </ul>
	 */
	public static final TransferReason1Code UndividedPossession = new TransferReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndividedPossession";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferReason1Code.mmObject();
			codeName = TransferReasonCode.UndividedPossession.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReason1Code
	 * TransferReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferBetweenSpouses"</li>
	 * </ul>
	 */
	public static final TransferReason1Code TransferBetweenSpouses = new TransferReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferBetweenSpouses";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferReason1Code.mmObject();
			codeName = TransferReasonCode.TransferBetweenSpouses.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReason1Code
	 * TransferReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * </ul>
	 */
	public static final TransferReason1Code Trade = new TransferReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferReason1Code.mmObject();
			codeName = TransferReasonCode.Trade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReason1Code
	 * TransferReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrdinaryTransfer"</li>
	 * </ul>
	 */
	public static final TransferReason1Code OrdinaryTransfer = new TransferReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrdinaryTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferReason1Code.mmObject();
			codeName = TransferReasonCode.OrdinaryTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReason1Code
	 * TransferReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Heritage"</li>
	 * </ul>
	 */
	public static final TransferReason1Code Heritage = new TransferReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Heritage";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferReason1Code.mmObject();
			codeName = TransferReasonCode.Heritage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReason1Code
	 * TransferReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gift"</li>
	 * </ul>
	 */
	public static final TransferReason1Code Gift = new TransferReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gift";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferReason1Code.mmObject();
			codeName = TransferReasonCode.Gift.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReason1Code
	 * TransferReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgedAccountTransfer"</li>
	 * </ul>
	 */
	public static final TransferReason1Code PledgedAccountTransfer = new TransferReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgedAccountTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferReason1Code.mmObject();
			codeName = TransferReasonCode.PledgedAccountTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReason1Code
	 * TransferReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TDTFrameworkTransfer"</li>
	 * </ul>
	 */
	public static final TransferReason1Code TDTFrameworkTransfer = new TransferReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TDTFrameworkTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferReason1Code.mmObject();
			codeName = TransferReasonCode.TDTFrameworkTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReason1Code
	 * TransferReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferBetweenDifferentBeneficiaries"</li>
	 * </ul>
	 */
	public static final TransferReason1Code TransferBetweenDifferentBeneficiaries = new TransferReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferBetweenDifferentBeneficiaries";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferReason1Code.mmObject();
			codeName = TransferReasonCode.TransferBetweenDifferentBeneficiaries.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReason1Code
	 * TransferReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Demerger"</li>
	 * </ul>
	 */
	public static final TransferReason1Code Demerger = new TransferReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Demerger";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferReason1Code.mmObject();
			codeName = TransferReasonCode.Demerger.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReason1Code
	 * TransferReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BetweenOwnAccounts"</li>
	 * </ul>
	 */
	public static final TransferReason1Code BetweenOwnAccounts = new TransferReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BetweenOwnAccounts";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferReason1Code.mmObject();
			codeName = TransferReasonCode.BetweenOwnAccounts.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TransferReason1Code> codesByName = new LinkedHashMap<>();

	protected TransferReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("TRAU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransferReason1Code";
				definition = "Specifies the reason for the assets transfer.";
				trace_lazy = () -> TransferReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransferReason1Code.UndividedPossession, com.tools20022.repository.codeset.TransferReason1Code.TransferBetweenSpouses,
						com.tools20022.repository.codeset.TransferReason1Code.Trade, com.tools20022.repository.codeset.TransferReason1Code.OrdinaryTransfer, com.tools20022.repository.codeset.TransferReason1Code.Heritage,
						com.tools20022.repository.codeset.TransferReason1Code.Gift, com.tools20022.repository.codeset.TransferReason1Code.PledgedAccountTransfer, com.tools20022.repository.codeset.TransferReason1Code.TDTFrameworkTransfer,
						com.tools20022.repository.codeset.TransferReason1Code.TransferBetweenDifferentBeneficiaries, com.tools20022.repository.codeset.TransferReason1Code.Demerger,
						com.tools20022.repository.codeset.TransferReason1Code.BetweenOwnAccounts);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UndividedPossession.getCodeName().get(), UndividedPossession);
		codesByName.put(TransferBetweenSpouses.getCodeName().get(), TransferBetweenSpouses);
		codesByName.put(Trade.getCodeName().get(), Trade);
		codesByName.put(OrdinaryTransfer.getCodeName().get(), OrdinaryTransfer);
		codesByName.put(Heritage.getCodeName().get(), Heritage);
		codesByName.put(Gift.getCodeName().get(), Gift);
		codesByName.put(PledgedAccountTransfer.getCodeName().get(), PledgedAccountTransfer);
		codesByName.put(TDTFrameworkTransfer.getCodeName().get(), TDTFrameworkTransfer);
		codesByName.put(TransferBetweenDifferentBeneficiaries.getCodeName().get(), TransferBetweenDifferentBeneficiaries);
		codesByName.put(Demerger.getCodeName().get(), Demerger);
		codesByName.put(BetweenOwnAccounts.getCodeName().get(), BetweenOwnAccounts);
	}

	public static TransferReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransferReason1Code[] values() {
		TransferReason1Code[] values = new TransferReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransferReason1Code> {
		@Override
		public TransferReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransferReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}