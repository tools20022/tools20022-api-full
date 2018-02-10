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
import com.tools20022.repository.codeset.CollateralType3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of collateral.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CollateralType3Code#Cash
 * CollateralType3Code.Cash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralType3Code#Securities
 * CollateralType3Code.Securities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralType3Code#PhysicalEntities
 * CollateralType3Code.PhysicalEntities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralType3Code#Insurance
 * CollateralType3Code.Insurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralType3Code#StockCertificate
 * CollateralType3Code.StockCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CollateralType3Code#Bond
 * CollateralType3Code.Bond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralType3Code#BankGuarantee
 * CollateralType3Code.BankGuarantee}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CollateralType3Code#Other
 * CollateralType3Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode
 * CollateralTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CASH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of collateral."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CollateralType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralType3Code
	 * CollateralType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * </ul>
	 */
	public static final CollateralType3Code Cash = new CollateralType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralType3Code.mmObject();
			codeName = CollateralTypeCode.Cash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralType3Code
	 * CollateralType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Securities"</li>
	 * </ul>
	 */
	public static final CollateralType3Code Securities = new CollateralType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Securities";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralType3Code.mmObject();
			codeName = CollateralTypeCode.Securities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralType3Code
	 * CollateralType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalEntities"</li>
	 * </ul>
	 */
	public static final CollateralType3Code PhysicalEntities = new CollateralType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalEntities";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralType3Code.mmObject();
			codeName = CollateralTypeCode.PhysicalEntities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralType3Code
	 * CollateralType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Insurance"</li>
	 * </ul>
	 */
	public static final CollateralType3Code Insurance = new CollateralType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Insurance";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralType3Code.mmObject();
			codeName = CollateralTypeCode.Insurance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralType3Code
	 * CollateralType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockCertificate"</li>
	 * </ul>
	 */
	public static final CollateralType3Code StockCertificate = new CollateralType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockCertificate";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralType3Code.mmObject();
			codeName = CollateralTypeCode.StockCertificate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralType3Code
	 * CollateralType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bond"</li>
	 * </ul>
	 */
	public static final CollateralType3Code Bond = new CollateralType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bond";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralType3Code.mmObject();
			codeName = CollateralTypeCode.Bond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralType3Code
	 * CollateralType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankGuarantee"</li>
	 * </ul>
	 */
	public static final CollateralType3Code BankGuarantee = new CollateralType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankGuarantee";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralType3Code.mmObject();
			codeName = CollateralTypeCode.BankGuarantee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralType3Code
	 * CollateralType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final CollateralType3Code Other = new CollateralType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralType3Code.mmObject();
			codeName = CollateralTypeCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CollateralType3Code> codesByName = new LinkedHashMap<>();

	protected CollateralType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CASH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralType3Code";
				definition = "Specifies the type of collateral.";
				trace_lazy = () -> CollateralTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CollateralType3Code.Cash, com.tools20022.repository.codeset.CollateralType3Code.Securities,
						com.tools20022.repository.codeset.CollateralType3Code.PhysicalEntities, com.tools20022.repository.codeset.CollateralType3Code.Insurance, com.tools20022.repository.codeset.CollateralType3Code.StockCertificate,
						com.tools20022.repository.codeset.CollateralType3Code.Bond, com.tools20022.repository.codeset.CollateralType3Code.BankGuarantee, com.tools20022.repository.codeset.CollateralType3Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Cash.getCodeName().get(), Cash);
		codesByName.put(Securities.getCodeName().get(), Securities);
		codesByName.put(PhysicalEntities.getCodeName().get(), PhysicalEntities);
		codesByName.put(Insurance.getCodeName().get(), Insurance);
		codesByName.put(StockCertificate.getCodeName().get(), StockCertificate);
		codesByName.put(Bond.getCodeName().get(), Bond);
		codesByName.put(BankGuarantee.getCodeName().get(), BankGuarantee);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static CollateralType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CollateralType3Code[] values() {
		CollateralType3Code[] values = new CollateralType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CollateralType3Code> {
		@Override
		public CollateralType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CollateralType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}