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
import com.tools20022.repository.codeset.FinancialInstrumentProductType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of product or financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code#CertificateOfDeposit
 * FinancialInstrumentProductType1Code.CertificateOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code#CommercialPaper
 * FinancialInstrumentProductType1Code.CommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code#OtherShortTermDebtSecurities
 * FinancialInstrumentProductType1Code.OtherShortTermDebtSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code#AssetBackedCommercialPaper
 * FinancialInstrumentProductType1Code.AssetBackedCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code#FloatingRateNote
 * FinancialInstrumentProductType1Code.FloatingRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code#CallAccountCallMoney
 * FinancialInstrumentProductType1Code.CallAccountCallMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code#Deposit
 * FinancialInstrumentProductType1Code.Deposit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
 * FinancialInstrumentProductTypeCode}</li>
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
 * "FinancialInstrumentProductType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of product or financial instrument."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FinancialInstrumentProductType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code
	 * FinancialInstrumentProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateOfDeposit"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentProductType1Code CertificateOfDeposit = new FinancialInstrumentProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateOfDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductType1Code.mmObject();
			codeName = FinancialInstrumentProductTypeCode.CertificateOfDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code
	 * FinancialInstrumentProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialPaper"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentProductType1Code CommercialPaper = new FinancialInstrumentProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialPaper";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductType1Code.mmObject();
			codeName = FinancialInstrumentProductTypeCode.CommercialPaper.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code
	 * FinancialInstrumentProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherShortTermDebtSecurities"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentProductType1Code OtherShortTermDebtSecurities = new FinancialInstrumentProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherShortTermDebtSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductType1Code.mmObject();
			codeName = FinancialInstrumentProductTypeCode.OtherShortTermDebtSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code
	 * FinancialInstrumentProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetBackedCommercialPaper"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentProductType1Code AssetBackedCommercialPaper = new FinancialInstrumentProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetBackedCommercialPaper";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductType1Code.mmObject();
			codeName = FinancialInstrumentProductTypeCode.AssetBackedCommercialPaper.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code
	 * FinancialInstrumentProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloatingRateNote"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentProductType1Code FloatingRateNote = new FinancialInstrumentProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatingRateNote";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductType1Code.mmObject();
			codeName = FinancialInstrumentProductTypeCode.FloatingRateNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code
	 * FinancialInstrumentProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallAccountCallMoney"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentProductType1Code CallAccountCallMoney = new FinancialInstrumentProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallAccountCallMoney";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductType1Code.mmObject();
			codeName = FinancialInstrumentProductTypeCode.CallAccountCallMoney.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code
	 * FinancialInstrumentProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deposit"</li>
	 * </ul>
	 */
	public static final FinancialInstrumentProductType1Code Deposit = new FinancialInstrumentProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deposit";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductType1Code.mmObject();
			codeName = FinancialInstrumentProductTypeCode.Deposit.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FinancialInstrumentProductType1Code> codesByName = new LinkedHashMap<>();

	protected FinancialInstrumentProductType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentProductType1Code";
				definition = "Specifies the type of product or financial instrument.";
				trace_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FinancialInstrumentProductType1Code.CertificateOfDeposit, com.tools20022.repository.codeset.FinancialInstrumentProductType1Code.CommercialPaper,
						com.tools20022.repository.codeset.FinancialInstrumentProductType1Code.OtherShortTermDebtSecurities, com.tools20022.repository.codeset.FinancialInstrumentProductType1Code.AssetBackedCommercialPaper,
						com.tools20022.repository.codeset.FinancialInstrumentProductType1Code.FloatingRateNote, com.tools20022.repository.codeset.FinancialInstrumentProductType1Code.CallAccountCallMoney,
						com.tools20022.repository.codeset.FinancialInstrumentProductType1Code.Deposit);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CertificateOfDeposit.getCodeName().get(), CertificateOfDeposit);
		codesByName.put(CommercialPaper.getCodeName().get(), CommercialPaper);
		codesByName.put(OtherShortTermDebtSecurities.getCodeName().get(), OtherShortTermDebtSecurities);
		codesByName.put(AssetBackedCommercialPaper.getCodeName().get(), AssetBackedCommercialPaper);
		codesByName.put(FloatingRateNote.getCodeName().get(), FloatingRateNote);
		codesByName.put(CallAccountCallMoney.getCodeName().get(), CallAccountCallMoney);
		codesByName.put(Deposit.getCodeName().get(), Deposit);
	}

	public static FinancialInstrumentProductType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FinancialInstrumentProductType1Code[] values() {
		FinancialInstrumentProductType1Code[] values = new FinancialInstrumentProductType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FinancialInstrumentProductType1Code> {
		@Override
		public FinancialInstrumentProductType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FinancialInstrumentProductType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}