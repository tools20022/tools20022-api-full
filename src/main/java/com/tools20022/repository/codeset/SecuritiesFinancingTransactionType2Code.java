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
import com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of securities financing transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code#Repo
 * SecuritiesFinancingTransactionType2Code.Repo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code#ReverseRepo
 * SecuritiesFinancingTransactionType2Code.ReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code#SecuritiesBorrowing
 * SecuritiesFinancingTransactionType2Code.SecuritiesBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code#SecuritiesLending
 * SecuritiesFinancingTransactionType2Code.SecuritiesLending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code#BuySellBack
 * SecuritiesFinancingTransactionType2Code.BuySellBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code#SellBuyBack
 * SecuritiesFinancingTransactionType2Code.SellBuyBack}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
 * SecuritiesTransactionTypeV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"REPU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancingTransactionType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of securities financing transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType1Code
 * SecuritiesFinancingTransactionType1Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesFinancingTransactionType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code
	 * SecuritiesFinancingTransactionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType1Code#Repo
	 * SecuritiesFinancingTransactionType1Code.Repo}</li>
	 * </ul>
	 */
	public static final SecuritiesFinancingTransactionType2Code Repo = new SecuritiesFinancingTransactionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repo";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionType1Code.Repo;
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Repo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code
	 * SecuritiesFinancingTransactionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseRepo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType1Code#ReverseRepo
	 * SecuritiesFinancingTransactionType1Code.ReverseRepo}</li>
	 * </ul>
	 */
	public static final SecuritiesFinancingTransactionType2Code ReverseRepo = new SecuritiesFinancingTransactionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseRepo";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionType1Code.ReverseRepo;
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.ReverseRepo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code
	 * SecuritiesFinancingTransactionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBorrowing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType1Code#SecuritiesBorrowing
	 * SecuritiesFinancingTransactionType1Code.SecuritiesBorrowing}</li>
	 * </ul>
	 */
	public static final SecuritiesFinancingTransactionType2Code SecuritiesBorrowing = new SecuritiesFinancingTransactionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBorrowing";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionType1Code.SecuritiesBorrowing;
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.SecuritiesBorrowing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code
	 * SecuritiesFinancingTransactionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType1Code#SecuritiesLending
	 * SecuritiesFinancingTransactionType1Code.SecuritiesLending}</li>
	 * </ul>
	 */
	public static final SecuritiesFinancingTransactionType2Code SecuritiesLending = new SecuritiesFinancingTransactionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLending";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionType1Code.SecuritiesLending;
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.SecuritiesLending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code
	 * SecuritiesFinancingTransactionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySellBack"</li>
	 * </ul>
	 */
	public static final SecuritiesFinancingTransactionType2Code BuySellBack = new SecuritiesFinancingTransactionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuySellBack";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.BuySellBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code
	 * SecuritiesFinancingTransactionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellBuyBack"</li>
	 * </ul>
	 */
	public static final SecuritiesFinancingTransactionType2Code SellBuyBack = new SecuritiesFinancingTransactionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellBuyBack";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.SellBuyBack.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SecuritiesFinancingTransactionType2Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesFinancingTransactionType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("REPU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancingTransactionType2Code";
				definition = "Specifies the type of securities financing transaction.";
				previousVersion_lazy = () -> SecuritiesFinancingTransactionType1Code.mmObject();
				trace_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code.Repo, com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code.ReverseRepo,
						com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code.SecuritiesBorrowing, com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code.SecuritiesLending,
						com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code.BuySellBack, com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code.SellBuyBack);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Repo.getCodeName().get(), Repo);
		codesByName.put(ReverseRepo.getCodeName().get(), ReverseRepo);
		codesByName.put(SecuritiesBorrowing.getCodeName().get(), SecuritiesBorrowing);
		codesByName.put(SecuritiesLending.getCodeName().get(), SecuritiesLending);
		codesByName.put(BuySellBack.getCodeName().get(), BuySellBack);
		codesByName.put(SellBuyBack.getCodeName().get(), SellBuyBack);
	}

	public static SecuritiesFinancingTransactionType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesFinancingTransactionType2Code[] values() {
		SecuritiesFinancingTransactionType2Code[] values = new SecuritiesFinancingTransactionType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesFinancingTransactionType2Code> {
		@Override
		public SecuritiesFinancingTransactionType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesFinancingTransactionType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}