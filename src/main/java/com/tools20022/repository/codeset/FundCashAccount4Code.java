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
import com.tools20022.repository.codeset.FundCashAccount4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the account type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccount4Code#HedgeFund
 * FundCashAccount4Code.HedgeFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccount4Code#PensionFundOrdinary
 * FundCashAccount4Code.PensionFundOrdinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccount4Code#PensionFundSpecial
 * FundCashAccount4Code.PensionFundSpecial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccount4Code#RetirementScheme
 * FundCashAccount4Code.RetirementScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccount4Code#CSDOmnibusAccount
 * FundCashAccount4Code.CSDOmnibusAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccount4Code#TechnicalOffsetAccount
 * FundCashAccount4Code.TechnicalOffsetAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccount4Code#InterCSDAccount
 * FundCashAccount4Code.InterCSDAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccount4Code#CSDMirrorAccount
 * FundCashAccount4Code.CSDMirrorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccount4Code#CSDParticipantAccount
 * FundCashAccount4Code.CSDParticipantAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccount4Code#PrivatePensionScheme
 * FundCashAccount4Code.PrivatePensionScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccount4Code#WorkplacePensionSchema
 * FundCashAccount4Code.WorkplacePensionSchema}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
 * FundCashAccountCode}</li>
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
 * "FundCashAccount4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the account type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FundCashAccount4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccount4Code
	 * FundCashAccount4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HedgeFund"</li>
	 * </ul>
	 */
	public static final FundCashAccount4Code HedgeFund = new FundCashAccount4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HedgeFund";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccount4Code.mmObject();
			codeName = FundCashAccountCode.HedgeFund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccount4Code
	 * FundCashAccount4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PensionFundOrdinary"</li>
	 * </ul>
	 */
	public static final FundCashAccount4Code PensionFundOrdinary = new FundCashAccount4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PensionFundOrdinary";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccount4Code.mmObject();
			codeName = FundCashAccountCode.PensionFundOrdinary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccount4Code
	 * FundCashAccount4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PensionFundSpecial"</li>
	 * </ul>
	 */
	public static final FundCashAccount4Code PensionFundSpecial = new FundCashAccount4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PensionFundSpecial";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccount4Code.mmObject();
			codeName = FundCashAccountCode.PensionFundSpecial.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccount4Code
	 * FundCashAccount4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetirementScheme"</li>
	 * </ul>
	 */
	public static final FundCashAccount4Code RetirementScheme = new FundCashAccount4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetirementScheme";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccount4Code.mmObject();
			codeName = FundCashAccountCode.RetirementScheme.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccount4Code
	 * FundCashAccount4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDOmnibusAccount"</li>
	 * </ul>
	 */
	public static final FundCashAccount4Code CSDOmnibusAccount = new FundCashAccount4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDOmnibusAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccount4Code.mmObject();
			codeName = FundCashAccountCode.CSDOmnibusAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccount4Code
	 * FundCashAccount4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalOffsetAccount"</li>
	 * </ul>
	 */
	public static final FundCashAccount4Code TechnicalOffsetAccount = new FundCashAccount4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalOffsetAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccount4Code.mmObject();
			codeName = FundCashAccountCode.TechnicalOffsetAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccount4Code
	 * FundCashAccount4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterCSDAccount"</li>
	 * </ul>
	 */
	public static final FundCashAccount4Code InterCSDAccount = new FundCashAccount4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterCSDAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccount4Code.mmObject();
			codeName = FundCashAccountCode.InterCSDAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccount4Code
	 * FundCashAccount4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDMirrorAccount"</li>
	 * </ul>
	 */
	public static final FundCashAccount4Code CSDMirrorAccount = new FundCashAccount4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDMirrorAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccount4Code.mmObject();
			codeName = FundCashAccountCode.CSDMirrorAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccount4Code
	 * FundCashAccount4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDParticipantAccount"</li>
	 * </ul>
	 */
	public static final FundCashAccount4Code CSDParticipantAccount = new FundCashAccount4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDParticipantAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccount4Code.mmObject();
			codeName = FundCashAccountCode.CSDParticipantAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccount4Code
	 * FundCashAccount4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivatePensionScheme"</li>
	 * </ul>
	 */
	public static final FundCashAccount4Code PrivatePensionScheme = new FundCashAccount4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrivatePensionScheme";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccount4Code.mmObject();
			codeName = FundCashAccountCode.PrivatePensionScheme.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccount4Code
	 * FundCashAccount4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WorkplacePensionSchema"</li>
	 * </ul>
	 */
	public static final FundCashAccount4Code WorkplacePensionSchema = new FundCashAccount4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WorkplacePensionSchema";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccount4Code.mmObject();
			codeName = FundCashAccountCode.WorkplacePensionSchema.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FundCashAccount4Code> codesByName = new LinkedHashMap<>();

	protected FundCashAccount4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundCashAccount4Code";
				definition = "Specifies the account type.";
				trace_lazy = () -> FundCashAccountCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FundCashAccount4Code.HedgeFund, com.tools20022.repository.codeset.FundCashAccount4Code.PensionFundOrdinary,
						com.tools20022.repository.codeset.FundCashAccount4Code.PensionFundSpecial, com.tools20022.repository.codeset.FundCashAccount4Code.RetirementScheme,
						com.tools20022.repository.codeset.FundCashAccount4Code.CSDOmnibusAccount, com.tools20022.repository.codeset.FundCashAccount4Code.TechnicalOffsetAccount,
						com.tools20022.repository.codeset.FundCashAccount4Code.InterCSDAccount, com.tools20022.repository.codeset.FundCashAccount4Code.CSDMirrorAccount,
						com.tools20022.repository.codeset.FundCashAccount4Code.CSDParticipantAccount, com.tools20022.repository.codeset.FundCashAccount4Code.PrivatePensionScheme,
						com.tools20022.repository.codeset.FundCashAccount4Code.WorkplacePensionSchema);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(HedgeFund.getCodeName().get(), HedgeFund);
		codesByName.put(PensionFundOrdinary.getCodeName().get(), PensionFundOrdinary);
		codesByName.put(PensionFundSpecial.getCodeName().get(), PensionFundSpecial);
		codesByName.put(RetirementScheme.getCodeName().get(), RetirementScheme);
		codesByName.put(CSDOmnibusAccount.getCodeName().get(), CSDOmnibusAccount);
		codesByName.put(TechnicalOffsetAccount.getCodeName().get(), TechnicalOffsetAccount);
		codesByName.put(InterCSDAccount.getCodeName().get(), InterCSDAccount);
		codesByName.put(CSDMirrorAccount.getCodeName().get(), CSDMirrorAccount);
		codesByName.put(CSDParticipantAccount.getCodeName().get(), CSDParticipantAccount);
		codesByName.put(PrivatePensionScheme.getCodeName().get(), PrivatePensionScheme);
		codesByName.put(WorkplacePensionSchema.getCodeName().get(), WorkplacePensionSchema);
	}

	public static FundCashAccount4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FundCashAccount4Code[] values() {
		FundCashAccount4Code[] values = new FundCashAccount4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FundCashAccount4Code> {
		@Override
		public FundCashAccount4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FundCashAccount4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}