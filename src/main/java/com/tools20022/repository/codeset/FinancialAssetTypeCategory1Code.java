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
import com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Categorization of financial asset type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code#Equities
 * FinancialAssetTypeCategory1Code.Equities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code#DebtInstruments
 * FinancialAssetTypeCategory1Code.DebtInstruments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code#Entitlements
 * FinancialAssetTypeCategory1Code.Entitlements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code#Derivatives
 * FinancialAssetTypeCategory1Code.Derivatives}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code#MoneyMarket
 * FinancialAssetTypeCategory1Code.MoneyMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code#Others
 * FinancialAssetTypeCategory1Code.Others}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode
 * FinancialAssetTypeCategoryCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"EQTY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialAssetTypeCategory1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Categorization of financial asset type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FinancialAssetTypeCategory1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code
	 * FinancialAssetTypeCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equities"</li>
	 * </ul>
	 */
	public static final FinancialAssetTypeCategory1Code Equities = new FinancialAssetTypeCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equities";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code.mmObject();
			codeName = FinancialAssetTypeCategoryCode.Equities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code
	 * FinancialAssetTypeCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtInstruments"</li>
	 * </ul>
	 */
	public static final FinancialAssetTypeCategory1Code DebtInstruments = new FinancialAssetTypeCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtInstruments";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code.mmObject();
			codeName = FinancialAssetTypeCategoryCode.DebtInstruments.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code
	 * FinancialAssetTypeCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entitlements"</li>
	 * </ul>
	 */
	public static final FinancialAssetTypeCategory1Code Entitlements = new FinancialAssetTypeCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Entitlements";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code.mmObject();
			codeName = FinancialAssetTypeCategoryCode.Entitlements.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code
	 * FinancialAssetTypeCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Derivatives"</li>
	 * </ul>
	 */
	public static final FinancialAssetTypeCategory1Code Derivatives = new FinancialAssetTypeCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Derivatives";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code.mmObject();
			codeName = FinancialAssetTypeCategoryCode.Derivatives.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code
	 * FinancialAssetTypeCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyMarket"</li>
	 * </ul>
	 */
	public static final FinancialAssetTypeCategory1Code MoneyMarket = new FinancialAssetTypeCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code.mmObject();
			codeName = FinancialAssetTypeCategoryCode.MoneyMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code
	 * FinancialAssetTypeCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Others"</li>
	 * </ul>
	 */
	public static final FinancialAssetTypeCategory1Code Others = new FinancialAssetTypeCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Others";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code.mmObject();
			codeName = FinancialAssetTypeCategoryCode.Others.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FinancialAssetTypeCategory1Code> codesByName = new LinkedHashMap<>();

	protected FinancialAssetTypeCategory1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EQTY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialAssetTypeCategory1Code";
				definition = "Categorization of financial asset type.";
				trace_lazy = () -> FinancialAssetTypeCategoryCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code.Equities, com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code.DebtInstruments,
						com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code.Entitlements, com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code.Derivatives,
						com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code.MoneyMarket, com.tools20022.repository.codeset.FinancialAssetTypeCategory1Code.Others);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Equities.getCodeName().get(), Equities);
		codesByName.put(DebtInstruments.getCodeName().get(), DebtInstruments);
		codesByName.put(Entitlements.getCodeName().get(), Entitlements);
		codesByName.put(Derivatives.getCodeName().get(), Derivatives);
		codesByName.put(MoneyMarket.getCodeName().get(), MoneyMarket);
		codesByName.put(Others.getCodeName().get(), Others);
	}

	public static FinancialAssetTypeCategory1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FinancialAssetTypeCategory1Code[] values() {
		FinancialAssetTypeCategory1Code[] values = new FinancialAssetTypeCategory1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FinancialAssetTypeCategory1Code> {
		@Override
		public FinancialAssetTypeCategory1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FinancialAssetTypeCategory1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}