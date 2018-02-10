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
import com.tools20022.repository.codeset.AllOtherCashCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if remaining assets are transferred as cash.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AllOtherCashCode#LiquidatedTransferAsCash
 * AllOtherCashCode.LiquidatedTransferAsCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AllOtherCashCode#NotLiquidatedTransferAsCash
 * AllOtherCashCode.NotLiquidatedTransferAsCash}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AllOtherCash1Code
 * AllOtherCash1Code}</li>
 * </ul>
 * </li>
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
 * "AllOtherCashCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies if remaining assets are transferred as cash."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AllOtherCashCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Remaining assets in a portfolio not listed for transfer should be
	 * liquidated and transferred as cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AllOtherCashCode
	 * AllOtherCashCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIQU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidatedTransferAsCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Remaining assets in a portfolio not listed for transfer should be liquidated and transferred as cash."
	 * </li>
	 * </ul>
	 */
	public static final AllOtherCashCode LiquidatedTransferAsCash = new AllOtherCashCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidatedTransferAsCash";
			definition = "Remaining assets in a portfolio not listed for transfer should be liquidated and transferred as cash.";
			owner_lazy = () -> com.tools20022.repository.codeset.AllOtherCashCode.mmObject();
			codeName = "LIQU";
		}
	};
	/**
	 * Remaining assets in a portfolio not listed for transfer should not be
	 * liquidated and transferred as cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AllOtherCashCode
	 * AllOtherCashCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NLIQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotLiquidatedTransferAsCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Remaining assets in a portfolio not listed for transfer should not be liquidated and transferred as cash."
	 * </li>
	 * </ul>
	 */
	public static final AllOtherCashCode NotLiquidatedTransferAsCash = new AllOtherCashCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotLiquidatedTransferAsCash";
			definition = "Remaining assets in a portfolio not listed for transfer should not be liquidated and transferred as cash.";
			owner_lazy = () -> com.tools20022.repository.codeset.AllOtherCashCode.mmObject();
			codeName = "NLIQ";
		}
	};
	final static private LinkedHashMap<String, AllOtherCashCode> codesByName = new LinkedHashMap<>();

	protected AllOtherCashCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AllOtherCashCode";
				definition = "Specifies if remaining assets are transferred as cash.";
				derivation_lazy = () -> Arrays.asList(AllOtherCash1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AllOtherCashCode.LiquidatedTransferAsCash, com.tools20022.repository.codeset.AllOtherCashCode.NotLiquidatedTransferAsCash);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(LiquidatedTransferAsCash.getCodeName().get(), LiquidatedTransferAsCash);
		codesByName.put(NotLiquidatedTransferAsCash.getCodeName().get(), NotLiquidatedTransferAsCash);
	}

	public static AllOtherCashCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AllOtherCashCode[] values() {
		AllOtherCashCode[] values = new AllOtherCashCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AllOtherCashCode> {
		@Override
		public AllOtherCashCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AllOtherCashCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}